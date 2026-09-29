package p000;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class tvc extends co3 {
    @Override // p000.f90
    /* JADX INFO: renamed from: b */
    public final IInterface mo3402b(IBinder iBinder) {
        int i = skd.f60964g;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService");
        return iInterfaceQueryLocalInterface instanceof tkd ? (tkd) iInterfaceQueryLocalInterface : new qkd(iBinder);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: f */
    public final Feature[] mo3671f() {
        return new Feature[]{pz6.f57048h};
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: i */
    public final int mo3404i() {
        return 17895000;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: m */
    public final String mo3405m() {
        return "com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: n */
    public final String mo3406n() {
        return "com.google.android.gms.mlkit.docscan.ui.DocumentScanningChimeraService.START";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: o */
    public final boolean mo3672o() {
        return true;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: s */
    public final boolean mo11614s() {
        return true;
    }
}
