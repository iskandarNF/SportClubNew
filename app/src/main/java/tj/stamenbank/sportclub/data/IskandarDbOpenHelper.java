package tj.stamenbank.sportclub.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import tj.stamenbank.sportclub.data.ClubIskandarContract.MemberEntry;

import androidx.annotation.Nullable;

public class IskandarDbOpenHelper extends SQLiteOpenHelper {
    public IskandarDbOpenHelper(Context context) {
        super(context, ClubIskandarContract.DATABASE_NAME, null, ClubIskandarContract.DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_MEMBERS_TABLE="CREATE TABLE "+ClubIskandarContract.MemberEntry.TABLE_NAME+"("
               + MemberEntry._ID + " INTEGER PRIMARY KEY, "
                +MemberEntry.COLUMN_FIRST_NAME + " TEXT, "
                +MemberEntry.COLUMN_LAST_NAME + " TEXT, "
                +MemberEntry.COLUMN_GENDER + " INTEGER NOT NULL, "
                +MemberEntry.COLUMN_SPORT + " TEXT "+")";
        db.execSQL(CREATE_MEMBERS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ClubIskandarContract.DATABASE_NAME);
        onCreate(db);
    }
}
