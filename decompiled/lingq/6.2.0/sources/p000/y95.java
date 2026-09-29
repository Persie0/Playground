package p000;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public interface y95 {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m24995a(y95 y95Var, String str, String str2, String str3, boolean z, String str4, String str5, String str6, LibrarySearchQuery librarySearchQuery, int i, SuspendLambda suspendLambda, int i2) {
        LibrarySearchQuery librarySearchQuery2;
        String str7 = (i2 & 4) != 0 ? "" : str3;
        boolean z2 = (i2 & 8) != 0 ? true : z;
        String str8 = (i2 & 16) != 0 ? "" : str4;
        String str9 = (i2 & 32) != 0 ? "" : str5;
        String str10 = (i2 & 64) != 0 ? "" : str6;
        if ((i2 & 128) != 0) {
            librarySearchQuery2 = new LibrarySearchQuery(null, null, 0, null, 8191);
        } else {
            librarySearchQuery2 = librarySearchQuery;
        }
        return ((C1296l) y95Var).m7323r(str, str2, str7, z2, str8, str9, str10, librarySearchQuery2, (i2 & 256) != 0 ? 1 : i, suspendLambda);
    }
}
