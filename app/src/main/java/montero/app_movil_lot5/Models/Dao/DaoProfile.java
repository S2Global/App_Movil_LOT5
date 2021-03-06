package montero.app_movil_lot5.Models.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import montero.app_movil_lot5.Models.Profile;

@Dao
public interface DaoProfile {

    @Insert
    void insertOnlySingleProfile (Profile profiles);
    @Insert
    void insertMultipleProfiles (List<Profile> formList);
    @Query("SELECT * FROM Profile WHERE id = :id")
    Profile fetchOneProfilebyId (int id);
    @Query("SELECT * FROM Profile WHERE username = :username")
    Profile fetchOneProfilebyUsername (String username);
    @Update
    void updateProfile (Profile movies);
    @Delete
    void deleteProfile (Profile movies);
    @Query("DELETE FROM Profile")
    void nukeProfiles();
    @Query("SELECT * FROM Profile")
    List<Profile> fetchAllProfiles();
}