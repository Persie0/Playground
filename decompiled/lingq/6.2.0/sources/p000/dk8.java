package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Priority;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dk8 implements fk8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f35746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q50 f35747b;

    public /* synthetic */ dk8(long j, q50 q50Var) {
        this.f35746a = j;
        this.f35747b = q50Var;
    }

    @Override // p000.fk8
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f35746a));
        q50 q50Var = this.f35747b;
        String str = q50Var.f57279a;
        Priority priority = q50Var.f57281c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(mk7.m16869a(priority))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(mk7.m16869a(priority)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
