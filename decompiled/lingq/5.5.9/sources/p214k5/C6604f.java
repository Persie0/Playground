package p214k5;

import androidx.work.impl.WorkDatabase;
import p213k4.AbstractC6583c;
import p288o4.InterfaceC7920f;

/* JADX INFO: renamed from: k5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6604f extends AbstractC6583c {
    public C6604f(WorkDatabase workDatabase) {
        super(workDatabase, 1);
    }

    @Override // androidx.room.SharedSQLiteStatement
    /* JADX INFO: renamed from: b */
    public final String mo4575b() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // p213k4.AbstractC6583c
    /* JADX INFO: renamed from: d */
    public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
        C6602d c6602d = (C6602d) obj;
        String str = c6602d.f37503a;
        if (str == null) {
            interfaceC7920f.mo13193J0(1);
        } else {
            interfaceC7920f.mo13197h0(str, 1);
        }
        Long l10 = c6602d.f37504b;
        if (l10 == null) {
            interfaceC7920f.mo13193J0(2);
        } else {
            interfaceC7920f.mo13194W(2, l10.longValue());
        }
    }
}
