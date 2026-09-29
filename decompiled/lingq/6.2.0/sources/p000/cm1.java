package p000;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.focus.C0301c;
import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.compose.runtime.snapshots.C0285a;
import com.lingq.core.domain.model.library.LibraryTab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;

/* JADX INFO: loaded from: classes.dex */
public final class cm1 implements bm0, vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10260a;

    /* JADX INFO: renamed from: b */
    public final Object f10261b;

    /* JADX INFO: renamed from: c */
    public final Object f10262c;

    public /* synthetic */ cm1(int i, Object obj, Object obj2) {
        this.f10260a = i;
        this.f10261b = obj;
        this.f10262c = obj2;
    }

    @Override // p000.bm0
    /* JADX INFO: renamed from: g */
    public void mo3851g(vl0 vl0Var, j88 j88Var) {
        ((sm0) this.f10262c).resumeWith(j88Var);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        long j;
        boolean zM1363i = false;
        switch (this.f10260a) {
            case 0:
                try {
                    ((i18) this.f10261b).cancel();
                    break;
                } catch (Throwable unused) {
                }
                return xfa.f68157a;
            case 1:
                KeyEvent keyEventM3729b = ((bi4) obj).m3729b();
                if (((yw4) this.f10261b).m25360a() == HandleState.Selection && keyEventM3729b.getKeyCode() == 4 && ahd.m421a(chd.m4668b(keyEventM3729b), 1)) {
                    ((C0205f) this.f10262c).m1106g(null);
                    zM1363i = true;
                }
                return Boolean.valueOf(zM1363i);
            case 2:
                C0285a c0285a = (C0285a) obj;
                synchronized (nc9.f52602c) {
                    j = nc9.f52604e;
                    nc9.f52604e = 1 + j;
                }
                return new s66(j, c0285a, (vi3) this.f10261b, (vi3) this.f10262c);
            case 3:
                C3552rx c3552rx = (C3552rx) this.f10261b;
                Object obj2 = c3552rx.f59987b;
                sm0 sm0Var = (sm0) this.f10262c;
                synchronized (obj2) {
                    ((ArrayList) c3552rx.f59988c).remove(sm0Var);
                }
                return xfa.f68157a;
            case 4:
                LibraryTab libraryTab = (LibraryTab) obj;
                libraryTab.getClass();
                ((b85) this.f10261b).mo3444X(((d95) this.f10262c).f35217b, libraryTab);
                return xfa.f68157a;
            case 5:
                return ((tf4) this.f10261b).invoke(((List) this.f10262c).get(((Number) obj).intValue()));
            default:
                KeyEvent keyEventM3729b2 = ((bi4) obj).m3729b();
                InterfaceC0300b interfaceC0300b = (InterfaceC0300b) this.f10261b;
                InputDevice device = keyEventM3729b2.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEventM3729b2.getSource() == 33554433) && ahd.m421a(chd.m4668b(keyEventM3729b2), 2) && keyEventM3729b2.getSource() != 257)) {
                    if (AbstractC3184kh.m15209c(19, keyEventM3729b2)) {
                        zM1363i = ((C0301c) interfaceC0300b).m1363i(5, true);
                    } else if (AbstractC3184kh.m15209c(20, keyEventM3729b2)) {
                        zM1363i = ((C0301c) interfaceC0300b).m1363i(6, true);
                    } else if (AbstractC3184kh.m15209c(21, keyEventM3729b2)) {
                        zM1363i = ((C0301c) interfaceC0300b).m1363i(3, true);
                    } else if (AbstractC3184kh.m15209c(22, keyEventM3729b2)) {
                        zM1363i = ((C0301c) interfaceC0300b).m1363i(4, true);
                    } else if (AbstractC3184kh.m15209c(23, keyEventM3729b2)) {
                        ld9 ld9Var = ((yw4) this.f10262c).f70571c;
                        if (ld9Var != null) {
                            ((pa2) ld9Var).m19005b();
                        }
                        zM1363i = true;
                    }
                }
                return Boolean.valueOf(zM1363i);
        }
    }

    @Override // p000.bm0
    /* JADX INFO: renamed from: j */
    public void mo3854j(vl0 vl0Var, IOException iOException) {
        if (((i18) vl0Var).f43339K) {
            return;
        }
        ((sm0) this.f10262c).resumeWith(new Result.Failure(iOException));
    }
}
