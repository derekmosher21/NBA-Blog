package org.wcci.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "category")
    private Collection<BlogPost> blogPosts;

    protected Category() {
    }

    public Category(String name) {
        this.name = name;

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<BlogPost> getBlogPosts() {
        return blogPosts;
    }


}
