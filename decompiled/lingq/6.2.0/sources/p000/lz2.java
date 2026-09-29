package p000;

import android.util.Log;
import androidx.window.core.VerificationMode;
import androidx.window.core.WindowStrictModeException;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class lz2 extends c4d {

    /* JADX INFO: renamed from: a */
    public final Object f50328a;

    /* JADX INFO: renamed from: b */
    public final String f50329b;

    /* JADX INFO: renamed from: c */
    public final VerificationMode f50330c;

    /* JADX INFO: renamed from: d */
    public final WindowStrictModeException f50331d;

    public lz2(Object obj, String str, q41 q41Var, VerificationMode verificationMode) {
        Collection collectionAsList;
        obj.getClass();
        verificationMode.getClass();
        this.f50328a = obj;
        this.f50329b = str;
        this.f50330c = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(str + " value: " + obj);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length < 0) {
            C3386nv.m17624j(ux5.m22989l("Requested element count ", length, " is less than zero."));
            throw null;
        }
        if (length == 0) {
            collectionAsList = EmptyList.f47638a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionAsList = AbstractC3550rv.m20852t0(stackTrace);
            } else if (length == 1) {
                collectionAsList = vz1.m23604J(stackTrace[length2 - 1]);
            } else {
                collectionAsList = Arrays.asList(AbstractC3550rv.m20832Z(stackTrace, length2 - length, length2));
                collectionAsList.getClass();
            }
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) collectionAsList.toArray(new StackTraceElement[0]));
        this.f50331d = windowStrictModeException;
    }

    @Override // p000.c4d
    /* JADX INFO: renamed from: a */
    public final Object mo4311a() throws WindowStrictModeException {
        int i = kz2.f48793a[this.f50330c.ordinal()];
        if (i == 1) {
            throw this.f50331d;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            gm5.m12750e();
            return null;
        }
        Object obj = this.f50328a;
        obj.getClass();
        Log.d("u69", this.f50329b + " value: " + obj);
        return null;
    }

    @Override // p000.c4d
    /* JADX INFO: renamed from: c */
    public final c4d mo4312c(String str, vi3 vi3Var) {
        return this;
    }
}
