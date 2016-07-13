package org.programirame.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtilityService {

    public <E> List<E> makeList(Iterable<E> iter) {
        List<E> list = new ArrayList<>();
        for (E item : iter) {
            list.add(item);
        }
        return list;
    }

}
