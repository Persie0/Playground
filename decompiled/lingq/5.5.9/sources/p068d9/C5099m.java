package p068d9;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p135g9.C5717a;
import p174i9.InterfaceC6208b;
import p452w8.AbstractC9838s;
import p479xa.C10144m;

/* JADX INFO: renamed from: d9.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5099m implements C5104r.a, C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f33043a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33044b;

    public /* synthetic */ C5099m(long j10, AbstractC9838s abstractC9838s) {
        this.f33043a = j10;
        this.f33044b = abstractC9838s;
    }

    public /* synthetic */ C5099m(InterfaceC6208b.a aVar, long j10) {
        this.f33044b = aVar;
        this.f33043a = j10;
    }

    @Override // p068d9.C5104r.a
    public final Object apply(Object obj) {
        AbstractC9838s abstractC9838s = (AbstractC9838s) this.f33044b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f33043a));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC9838s.mo18319b(), String.valueOf(C5717a.m12075a(abstractC9838s.mo18321d()))}) < 1) {
            contentValues.put("backend_name", abstractC9838s.mo18319b());
            contentValues.put("priority", Integer.valueOf(C5717a.m12075a(abstractC9838s.mo18321d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        ((InterfaceC6208b) obj).getClass();
    }
}
