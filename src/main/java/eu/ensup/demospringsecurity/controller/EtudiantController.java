package eu.ensup.demospringsecurity.controller;

import eu.ensup.demospringsecurity.domaine.Etudiant;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class EtudiantController {

    @GetMapping(value="/etudiants/{id}")
    public Etudiant index(@PathVariable Integer id) {
        List<Etudiant> etudiantList = new ArrayList<>();
        Etudiant e1 = new Etudiant(1,"Pierre dupont");
        Etudiant e2 = new Etudiant(2,"Martin dubois");
        Etudiant e3 = new Etudiant(3, "Jean duchene");
        etudiantList.add(e1);
        etudiantList.add(e2);
        etudiantList.add(e3);

        Etudiant etudiant = etudiantList
                .stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);

        return etudiant;
    }

}
