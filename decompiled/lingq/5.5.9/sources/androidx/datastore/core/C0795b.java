package androidx.datastore.core;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.List;
import no.InterfaceC7882z;
import p144h3.C5885a;
import p385sf.C9000b;

/* JADX INFO: renamed from: androidx.datastore.core.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0795b {
    /* JADX INFO: renamed from: a */
    public static SingleProcessDataStore m3017a(List list, InterfaceC7882z interfaceC7882z, InterfaceC2041a interfaceC2041a) {
        C5207g.m11111f(list, "migrations");
        C5207g.m11111f(interfaceC7882z, "scope");
        return new SingleProcessDataStore(interfaceC2041a, C9000b.m17251q(new DataMigrationInitializer$Companion$getInitializer$1(list, null)), new C5885a(), interfaceC7882z);
    }
}
