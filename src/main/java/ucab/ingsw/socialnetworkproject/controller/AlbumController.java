package ucab.ingsw.socialnetworkproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ucab.ingsw.socialnetworkproject.command.UserNewAlbumCommand;

import ucab.ingsw.socialnetworkproject.command.UserRemoveAlbumCommand;
import ucab.ingsw.socialnetworkproject.command.UserUpdateAlbumCommand;
import ucab.ingsw.socialnetworkproject.service.AlbumService;

import javax.validation.Valid;

@Slf4j

@CrossOrigin //Permite conexion desde aplicacion externa.
@RestController
@RequestMapping(value = "/album", produces = "application/json")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @RequestMapping(value = "/add", consumes = "application/json", method = RequestMethod.POST)
    public ResponseEntity register(@Valid @RequestBody UserNewAlbumCommand command) {
        return albumService.addAlbum(command);
    }

    @RequestMapping(value = "/update", consumes = "application/json", method = RequestMethod.PUT)
    public ResponseEntity register(@Valid @RequestBody UserUpdateAlbumCommand command) {
        return albumService.updateAlbum(command);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity getAlbumById(@PathVariable("id") String id) {

        return albumService.getAlbumById(id);
    }

    @RequestMapping(value = "/getList/{id}", method = RequestMethod.GET)
    public ResponseEntity getAlbumList(@PathVariable("id") String id) {

        return albumService.getAlbumList(id);
    }

    @RequestMapping(value = "/remove", consumes = "application/json", method = RequestMethod.DELETE)
    public ResponseEntity removeFriend(@Valid @RequestBody UserRemoveAlbumCommand command) {
        return albumService.removeAlbum(command);
    }
}
