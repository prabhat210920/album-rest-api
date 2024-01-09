package org.restapi.SpringRestdemo.repository;

import java.util.List;

import org.restapi.SpringRestdemo.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
    List<Photo> findByAlbum_id(long id);

}
