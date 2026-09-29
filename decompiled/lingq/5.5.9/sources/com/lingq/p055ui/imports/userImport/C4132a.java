package com.lingq.p055ui.imports.userImport;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import androidx.view.C1024c0;
import com.lingq.commons.p053ui.UserImportDetailType;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: com.lingq.ui.imports.userImport.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4132a implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final UserImportDetailType f26837a;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.a$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: a */
        public static C4132a m10095a(C1024c0 c1024c0) {
            C5207g.m11111f(c1024c0, "savedStateHandle");
            if (!c1024c0.f6616a.containsKey("userImportDetailType")) {
                throw new IllegalArgumentException("Required argument \"userImportDetailType\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(UserImportDetailType.class) && !Serializable.class.isAssignableFrom(UserImportDetailType.class)) {
                throw new UnsupportedOperationException(UserImportDetailType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            UserImportDetailType userImportDetailType = (UserImportDetailType) c1024c0.m3929b("userImportDetailType");
            if (userImportDetailType != null) {
                return new C4132a(userImportDetailType);
            }
            throw new IllegalArgumentException("Argument \"userImportDetailType\" is marked as non-null but was passed a null value");
        }
    }

    public C4132a(UserImportDetailType userImportDetailType) {
        this.f26837a = userImportDetailType;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C4132a fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C4132a.class, "userImportDetailType")) {
            throw new IllegalArgumentException("Required argument \"userImportDetailType\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(UserImportDetailType.class) && !Serializable.class.isAssignableFrom(UserImportDetailType.class)) {
            throw new UnsupportedOperationException(UserImportDetailType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        UserImportDetailType userImportDetailType = (UserImportDetailType) bundle.get("userImportDetailType");
        if (userImportDetailType != null) {
            return new C4132a(userImportDetailType);
        }
        throw new IllegalArgumentException("Argument \"userImportDetailType\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4132a) && this.f26837a == ((C4132a) obj).f26837a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26837a.hashCode();
    }

    public final String toString() {
        return "UserImportSelectionFragmentArgs(userImportDetailType=" + this.f26837a + ")";
    }
}
