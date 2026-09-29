package p000;

import com.google.android.gms.internal.mlkit_vision_document_scanner.C0969a;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.navigation.model.LibraryShelfNavArg;
import com.lingq.core.navigation.model.LibraryTabNavArg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jkd {

    /* JADX INFO: renamed from: a */
    public static m2d f45657a;

    /* JADX INFO: renamed from: a */
    public static final LibraryShelfNavArg m14528a(LibraryShelf libraryShelf) {
        libraryShelf.getClass();
        boolean z = libraryShelf.f19493a;
        boolean z2 = libraryShelf.f19494b;
        List list = libraryShelf.f19495c;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m14529b((LibraryTab) it.next()));
        }
        return new LibraryShelfNavArg(z, z2, arrayList, libraryShelf.f19496d, libraryShelf.f19497e, libraryShelf.f19498f, libraryShelf.f19499g, libraryShelf.f19500h);
    }

    /* JADX INFO: renamed from: b */
    public static final LibraryTabNavArg m14529b(LibraryTab libraryTab) {
        libraryTab.getClass();
        return new LibraryTabNavArg(libraryTab.f19501a, libraryTab.f19502b, libraryTab.f19503c, libraryTab.f19504d, libraryTab.f19505e, libraryTab.f19506f);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C0969a m14530c() {
        C0969a c0969a;
        qjd qjdVar = new qjd();
        synchronized (jkd.class) {
            try {
                if (f45657a == null) {
                    f45657a = new m2d(2);
                }
                c0969a = (C0969a) f45657a.m21326o(qjdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0969a;
        return c0969a;
    }
}
