package p000;

import kotlin.AbstractC3192a;
import kotlinx.datetime.DateTimeFormatException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lab {

    /* JADX INFO: renamed from: a */
    public static final k34 f49375a = new k34(null, null);

    /* JADX INFO: renamed from: b */
    public static final cs4 f49376b = AbstractC3192a.m15356a(new e5a(25));

    /* JADX INFO: renamed from: a */
    public static final void m16050a(Object obj, String str) {
        if (obj == null) {
            throw new DateTimeFormatException(ux5.m22991n("Can not create a ", str, " from the given input: the field ", str, " is missing"));
        }
    }
}
