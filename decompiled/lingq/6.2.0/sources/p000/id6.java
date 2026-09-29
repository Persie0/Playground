package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.feature.imports.R$id;
import com.lingq.feature.imports.data.UserImportSourceType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class id6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final UserImportSourceType f43972a;

    /* JADX INFO: renamed from: b */
    public final String f43973b;

    /* JADX INFO: renamed from: c */
    public final String f43974c;

    /* JADX INFO: renamed from: d */
    public final String f43975d;

    /* JADX INFO: renamed from: e */
    public final boolean f43976e;

    /* JADX INFO: renamed from: f */
    public final int f43977f;

    public id6(UserImportSourceType userImportSourceType, String str, String str2, String str3, boolean z) {
        userImportSourceType.getClass();
        this.f43972a = userImportSourceType;
        this.f43973b = str;
        this.f43974c = str2;
        this.f43975d = str3;
        this.f43976e = z;
        this.f43977f = R$id.actionToImportData;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f43973b);
        bundle.putString("title", this.f43974c);
        bundle.putString("fileUri", this.f43975d);
        bundle.putBoolean("fromExternal", this.f43976e);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(UserImportSourceType.class);
        Serializable serializable = this.f43972a;
        if (zIsAssignableFrom) {
            serializable.getClass();
            bundle.putParcelable("type", (Parcelable) serializable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(UserImportSourceType.class)) {
            C3386nv.m17636w(UserImportSourceType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        serializable.getClass();
        bundle.putSerializable("type", serializable);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f43977f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id6)) {
            return false;
        }
        id6 id6Var = (id6) obj;
        return this.f43972a == id6Var.f43972a && this.f43973b.equals(id6Var.f43973b) && this.f43974c.equals(id6Var.f43974c) && this.f43975d.equals(id6Var.f43975d) && this.f43976e == id6Var.f43976e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43976e) + ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f43972a.hashCode() * 31, this.f43973b, 31), this.f43974c, 31), this.f43975d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionToImportData(type=");
        sb.append(this.f43972a);
        sb.append(", url=");
        sb.append(this.f43973b);
        sb.append(", title=");
        AbstractC3393o1.m17725C(sb, this.f43974c, ", fileUri=", this.f43975d, ", fromExternal=");
        return AbstractC3393o1.m17740o(sb, this.f43976e, ")");
    }
}
