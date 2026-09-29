package p389t2;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: t2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9190i implements InterfaceC9189h {

    /* JADX INFO: renamed from: a */
    public final LocaleList f47730a;

    public C9190i(Object obj) {
        this.f47730a = (LocaleList) obj;
    }

    @Override // p389t2.InterfaceC9189h
    /* JADX INFO: renamed from: a */
    public final String mo17529a() {
        return this.f47730a.toLanguageTags();
    }

    @Override // p389t2.InterfaceC9189h
    /* JADX INFO: renamed from: b */
    public final Object mo17530b() {
        return this.f47730a;
    }

    public final boolean equals(Object obj) {
        return this.f47730a.equals(((InterfaceC9189h) obj).mo17530b());
    }

    @Override // p389t2.InterfaceC9189h
    public final Locale get(int i10) {
        return this.f47730a.get(i10);
    }

    public final int hashCode() {
        return this.f47730a.hashCode();
    }

    @Override // p389t2.InterfaceC9189h
    public final boolean isEmpty() {
        return this.f47730a.isEmpty();
    }

    @Override // p389t2.InterfaceC9189h
    public final int size() {
        return this.f47730a.size();
    }

    public final String toString() {
        return this.f47730a.toString();
    }
}
