package p068d9;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.C2416m;
import p174i9.InterfaceC6208b;
import p479xa.C10144m;

/* JADX INFO: renamed from: d9.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5100n implements C5104r.a, C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f33045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33046b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f33047c;

    public /* synthetic */ C5100n(Object obj, Object obj2, Object obj3) {
        this.f33045a = obj;
        this.f33046b = obj2;
        this.f33047c = obj3;
    }

    @Override // p068d9.C5104r.a
    public final Object apply(Object obj) {
        C5104r c5104r = (C5104r) this.f33045a;
        String str = (String) this.f33046b;
        String str2 = (String) this.f33047c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        c5104r.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        C5104r.m10867Q(sQLiteDatabase.rawQuery(str2, null), new C5101o(c5104r, 1));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        InterfaceC6208b.a aVar = (InterfaceC6208b.a) this.f33045a;
        C2416m c2416m = (C2416m) this.f33046b;
        InterfaceC6208b interfaceC6208b = (InterfaceC6208b) obj;
        interfaceC6208b.getClass();
        interfaceC6208b.mo12805s(aVar, c2416m);
    }
}
