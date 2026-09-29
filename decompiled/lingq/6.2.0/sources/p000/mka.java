package p000;

import com.lingq.feature.imports.UserImportFragment;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mka implements InterfaceC2991f7, yr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserImportFragment f51454a;

    public /* synthetic */ mka(UserImportFragment userImportFragment) {
        this.f51454a = userImportFragment;
    }

    @Override // p000.InterfaceC2991f7
    /* JADX INFO: renamed from: c */
    public void mo2125c(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f51454a.m8998S0();
        }
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        Object value;
        r43.m20289a().m20290b(exc);
        C3244l c3244l = this.f51454a.m8997R0().f26184p;
        do {
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.FALSE));
    }
}
