package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.mlkit_vision_text_common.C0984o;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes2.dex */
public final class cwb implements xzc {

    /* JADX INFO: renamed from: a */
    public final Context f34662a;

    /* JADX INFO: renamed from: b */
    public final jx9 f34663b;

    /* JADX INFO: renamed from: c */
    public boolean f34664c;

    /* JADX INFO: renamed from: d */
    public boolean f34665d;

    /* JADX INFO: renamed from: e */
    public final C0984o f34666e;

    /* JADX INFO: renamed from: f */
    public ykd f34667f;

    public cwb(Context context, jx9 jx9Var, C0984o c0984o) {
        this.f34662a = context;
        this.f34663b = jx9Var;
        this.f34666e = c0984o;
    }

    /* JADX INFO: renamed from: b */
    public static zzvh m9914b(jx9 jx9Var) {
        int i;
        String strMo14184e = jx9Var.mo14184e();
        String strMo14185f = jx9Var.mo14185f();
        switch (jx9Var.mo14183d()) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            default:
                i = 1;
                break;
        }
        return new zzvh(i - 1, strMo14184e, strMo14185f, null, jx9Var.mo14180a(), true, false);
    }

    @Override // p000.xzc
    /* JADX INFO: renamed from: a */
    public final js9 mo9915a(z54 z54Var) throws MlKitException {
        lp6 lp6Var;
        if (this.f34667f == null) {
            zzb();
        }
        ykd ykdVar = this.f34667f;
        lda.m16130p(ykdVar);
        if (!this.f34664c) {
            try {
                ykdVar.m16776M(ykdVar.m16773J(), 1);
                this.f34664c = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init text recognizer ".concat(this.f34663b.mo14181b()), e);
            }
        }
        zzuq zzuqVar = new zzuq(z54Var.f70941d, z54Var.f70939b, z54Var.f70940c, 0, SystemClock.elapsedRealtime());
        int i = z54Var.f70941d;
        zzvf zzvfVarCreateFromParcel = null;
        if (i != -1) {
            if (i != 17) {
                if (i == 35) {
                    lp6Var = new lp6(null);
                } else if (i != 842094169) {
                    throw new MlKitException(ux5.m22988k(z54Var.f70941d, "Unsupported image format: "), 3);
                }
            }
            lda.m16130p(null);
            throw null;
        }
        Bitmap bitmap = z54Var.f70938a;
        lda.m16130p(bitmap);
        lp6Var = new lp6(bitmap);
        try {
            Parcel parcelM16773J = ykdVar.m16773J();
            int i2 = qrb.f58116a;
            parcelM16773J.writeStrongBinder(lp6Var);
            parcelM16773J.writeInt(1);
            zzuqVar.writeToParcel(parcelM16773J, 0);
            Parcel parcelM16775L = ykdVar.m16775L(parcelM16773J, 3);
            Parcelable.Creator<zzvf> creator = zzvf.CREATOR;
            if (parcelM16775L.readInt() != 0) {
                zzvfVarCreateFromParcel = creator.createFromParcel(parcelM16775L);
            }
            parcelM16775L.recycle();
            return new js9(zzvfVarCreateFromParcel);
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run text recognizer ".concat(this.f34663b.mo14181b()), e2);
        }
    }

    @Override // p000.xzc
    /* JADX INFO: renamed from: c */
    public final void mo9916c() {
        ykd ykdVar = this.f34667f;
        if (ykdVar != null) {
            try {
                ykdVar.m16776M(ykdVar.m16773J(), 2);
            } catch (RemoteException e) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(this.f34663b.mo14181b()), e);
            }
            this.f34667f = null;
        }
        this.f34664c = false;
    }

    @Override // p000.xzc
    public final void zzb() throws MlKitException {
        ykd ykdVarM25687R;
        C0984o c0984o = this.f34666e;
        Context context = this.f34662a;
        jx9 jx9Var = this.f34663b;
        if (this.f34667f != null) {
            return;
        }
        try {
            IInterface zkdVar = null;
            if (jx9Var.mo14186g()) {
                Log.d("DecoupledTextDelegate", "Start loading thick OCR module.");
                IBinder iBinderM2955b = ao2.m2949c(context, ao2.f7273c, jx9Var.mo14188i()).m2955b("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator");
                int i = ald.f819g;
                if (iBinderM2955b != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderM2955b.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
                    zkdVar = iInterfaceQueryLocalInterface instanceof bld ? (bld) iInterfaceQueryLocalInterface : new zkd(iBinderM2955b, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator", 2);
                }
                ykdVarM25687R = ((zkd) zkdVar).m25687R(new lp6(context), m9914b(jx9Var));
            } else {
                Log.d("DecoupledTextDelegate", "Start loading thin OCR module.");
                IBinder iBinderM2955b2 = ao2.m2949c(context, ao2.f7272b, jx9Var.mo14188i()).m2955b("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator");
                int i2 = ald.f819g;
                if (iBinderM2955b2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderM2955b2.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
                    zkdVar = iInterfaceQueryLocalInterface2 instanceof bld ? (bld) iInterfaceQueryLocalInterface2 : new zkd(iBinderM2955b2, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator", 2);
                }
                if (jx9Var.mo14183d() == 1) {
                    ykdVarM25687R = ((zkd) zkdVar).m25686Q(new lp6(context));
                } else {
                    ykdVarM25687R = ((zkd) zkdVar).m25687R(new lp6(context), m9914b(jx9Var));
                }
            }
            this.f34667f = ykdVarM25687R;
            c0984o.m5479b(new hg0(zzou.NO_ERROR, jx9Var.mo14186g()), zzov.ON_DEVICE_TEXT_LOAD);
        } catch (RemoteException e) {
            c0984o.m5479b(new hg0(zzou.OPTIONAL_MODULE_INIT_ERROR, jx9Var.mo14186g()), zzov.ON_DEVICE_TEXT_LOAD);
            throw new MlKitException("Failed to create text recognizer ".concat(jx9Var.mo14181b()), e);
        } catch (DynamiteModule$LoadingException e2) {
            c0984o.m5479b(new hg0(zzou.OPTIONAL_MODULE_NOT_AVAILABLE, jx9Var.mo14186g()), zzov.ON_DEVICE_TEXT_LOAD);
            if (jx9Var.mo14186g()) {
                throw new MlKitException(wq1.m24119o("Failed to load text module ", jx9Var.mo14181b(), ". ", e2.getMessage()), e2);
            }
            if (!this.f34665d) {
                pz6.m19578b(context, z6d.m25480c(jx9Var));
                this.f34665d = true;
            }
            throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }
}
