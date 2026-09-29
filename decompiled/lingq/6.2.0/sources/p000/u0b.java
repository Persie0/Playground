package p000;

import com.lingq.core.data.repository.C1308x;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public interface u0b {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Serializable m22378a(u0b u0bVar, String str, int i, String str2, boolean z, boolean z2, String str3, ContinuationImpl continuationImpl, int i2) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return ((C1308x) u0bVar).m7418l(str, i, str2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? -1 : 200, continuationImpl);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m22379b(u0b u0bVar, String str, int i, String str2, boolean z, boolean z2, String str3, ContinuationImpl continuationImpl, int i2) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return ((C1308x) u0bVar).m7417k(str, i, str2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? -1 : 200, continuationImpl);
    }
}
