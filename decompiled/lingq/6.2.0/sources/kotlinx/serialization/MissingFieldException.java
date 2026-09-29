package kotlinx.serialization;

import java.util.ArrayList;
import java.util.List;
import p000.ux5;
import p000.vz1;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
public final class MissingFieldException extends SerializationException {

    /* JADX INFO: renamed from: a */
    public final List f48238a;

    /* JADX INFO: renamed from: b */
    public final String f48239b;

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(String str, ArrayList arrayList) {
        String strM24125u;
        str.getClass();
        if (arrayList.size() == 1) {
            strM24125u = wq1.m24125u(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strM24125u = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(strM24125u, null, arrayList, str);
    }

    public MissingFieldException(String str, MissingFieldException missingFieldException, List list, String str2) {
        super(str, missingFieldException);
        this.f48238a = list;
        this.f48239b = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String str, String str2) {
        this(ux5.m22991n("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null, vz1.m23604J(str), str2);
        str2.getClass();
    }
}
