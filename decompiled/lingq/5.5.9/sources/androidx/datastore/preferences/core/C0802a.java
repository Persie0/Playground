package androidx.datastore.preferences.core;

import androidx.datastore.core.C0795b;
import bm.C1615a;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.io.File;
import java.util.List;
import no.InterfaceC7882z;

/* JADX INFO: renamed from: androidx.datastore.preferences.core.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0802a {
    /* JADX INFO: renamed from: a */
    public static PreferenceDataStore m3055a(List list, InterfaceC7882z interfaceC7882z, final InterfaceC2041a interfaceC2041a) {
        C5207g.m11111f(list, "migrations");
        C5207g.m11111f(interfaceC7882z, "scope");
        return new PreferenceDataStore(C0795b.m3017a(list, interfaceC7882z, new InterfaceC2041a<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final File mo807E() {
                File fileMo807E = interfaceC2041a.mo807E();
                if (C5207g.m11106a(C1615a.m5274L0(fileMo807E), "preferences_pb")) {
                    return fileMo807E;
                }
                throw new IllegalStateException(("File extension for file: " + fileMo807E + " does not match required extension for Preferences file: preferences_pb").toString());
            }
        }));
    }
}
