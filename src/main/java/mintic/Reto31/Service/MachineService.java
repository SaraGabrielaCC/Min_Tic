package mintic.Reto31.Service;

import mintic.Reto31.Entities.Machine;
import mintic.Reto31.Repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class MachineService {
    @Autowired
    private MachineRepository machineRepository;

    public List<Machine> getAll(){
        return machineRepository.getAll();
    }
    public Optional<Machine> getMachine(int id){
        return machineRepository.getMachine(id);
    }

    public Machine save (Machine machine){
        if (machine.getId() == null){
            return machineRepository.save(machine);
        } else {
            Optional<Machine> machine1 = machineRepository.getMachine(machine.getId());
            if(machine1.isPresent()){
                return machine;
            } else {
                return machineRepository.save(machine);
            }
        }
    }
}
