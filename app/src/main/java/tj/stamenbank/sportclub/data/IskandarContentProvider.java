package tj.stamenbank.sportclub.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class IskandarContentProvider extends ContentProvider {
    IskandarDbOpenHelper dbOpenHelper;


    @Override
    public boolean onCreate() {
        dbOpenHelper=new IskandarDbOpenHelper(getContext());
        return true;
    }

    @Override
    public Cursor query( Uri uri,  String[] projection,  String selection,  String[] selectionArgs,  String sortOrder) {
        return null;
    }


    @Override
    public Uri insert( Uri uri,  ContentValues values) {
        return null;
    }

    @Override
    public int delete( Uri uri,  String selection,  String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update( Uri uri,  ContentValues values,  String selection,  String[] selectionArgs) {
        return 0;
    }
    @Override
    public String getType( Uri uri) {
        return null;
    }
}
