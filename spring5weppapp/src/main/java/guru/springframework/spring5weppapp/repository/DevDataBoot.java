package guru.springframework.spring5weppapp.repository;

import guru.springframework.spring5weppapp.model.Author;
import guru.springframework.spring5weppapp.model.Publisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevDataBoot implements ApplicationListener<ContextRefreshedEvent> {

    PublisherRepository publisherRepository;

    AuthorRepository authorRepository;

    public DevDataBoot(PublisherRepository publisherRepository, AuthorRepository authorRepository) {
        this.publisherRepository = publisherRepository;
        this.authorRepository = authorRepository;
    }

    public void inIt() {

        Publisher p = new Publisher();
        p.setPublisherName("Ankit");

        Publisher p2 = new Publisher();
        p2.setPublisherName("Sneha");

        publisherRepository.save(p);
        publisherRepository.save(p2);


        authorRepository.save(new Author("APJ","Infosys"));
        authorRepository.save(new Author("Rohit","Sapient"));
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        inIt();
    }
}
