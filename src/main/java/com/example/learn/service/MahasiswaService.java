package com.example.learn.service;

import com.example.learn.model.Mahasiswa;
import java.util.List;

public interface MahasiswaService {
	
    List<Mahasiswa> ListMahasiswa();
    Mahasiswa saveOrUpdate(Mahasiswa mahasiswa);
    Mahasiswa getIdMahasiswa(Integer id);
    void DeleteData(Integer id);
}
