package p000;

import android.os.Parcelable;
import com.lingq.feature.imports.data.UserImportDetailType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class fka extends wta implements jka {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jka f39234b;

    /* JADX INFO: renamed from: c */
    public final UserImportDetailType f39235c;

    public fka(nl8 nl8Var, jka jkaVar) {
        nl8Var.getClass();
        jkaVar.getClass();
        this.f39234b = jkaVar;
        yja.Companion.getClass();
        if (!nl8Var.m17487a("userImportDetailType")) {
            C3386nv.m17626m("Required argument \"userImportDetailType\" is missing and does not have an android:defaultValue");
            throw null;
        }
        if (!Parcelable.class.isAssignableFrom(UserImportDetailType.class) && !Serializable.class.isAssignableFrom(UserImportDetailType.class)) {
            C3386nv.m17636w(UserImportDetailType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            throw null;
        }
        UserImportDetailType userImportDetailType = (UserImportDetailType) nl8Var.m17488b("userImportDetailType");
        if (userImportDetailType != null) {
            this.f39235c = userImportDetailType;
        } else {
            C3386nv.m17626m("Argument \"userImportDetailType\" is marked as non-null but was passed a null value");
            throw null;
        }
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: N0 */
    public final void mo9011N0(ika ikaVar) {
        this.f39234b.mo9011N0(ikaVar);
    }

    @Override // p000.jka
    public final void clear() {
        this.f39234b.clear();
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: l0 */
    public final eh9 mo9013l0() {
        return this.f39234b.mo9013l0();
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: u2 */
    public final eh9 mo9014u2() {
        return this.f39234b.mo9014u2();
    }
}
