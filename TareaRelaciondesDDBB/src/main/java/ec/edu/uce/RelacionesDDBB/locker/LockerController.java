package ec.edu.uce.RelacionesDDBB.locker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lockers")
public class LockerController {

    @Autowired
    LockerRepository lockerRepository;

    @GetMapping
    List<Locker> getLockers() {
        return lockerRepository.findAll();
    }

    @PostMapping
    Locker createLocker(@RequestBody Locker locker) {
        return lockerRepository.save(locker);
    }
}
