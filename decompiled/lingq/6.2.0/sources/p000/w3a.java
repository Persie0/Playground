package p000;

import com.lingq.core.data.repository.C1306v;
import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public interface w3a {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m23700b(w3a w3aVar, String str, String str2, TokenMeaning tokenMeaning, String str3, String str4, Integer num, ContinuationImpl continuationImpl, int i) {
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        return ((C1306v) w3aVar).m7385k(str, str2, tokenMeaning, str3, str4, num, continuationImpl);
    }
}
