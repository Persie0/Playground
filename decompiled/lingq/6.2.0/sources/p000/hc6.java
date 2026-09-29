package p000;

import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class hc6 {
    /* JADX INFO: renamed from: a */
    public static gc6 m13194a(int i, ReviewType reviewType, boolean z, boolean z2, int i2, String str, String str2, CardStatus cardStatus, String str3) {
        reviewType.getClass();
        str.getClass();
        cardStatus.getClass();
        str3.getClass();
        return new gc6(i, reviewType, z, z2, i2, str, str2, cardStatus, str3);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ gc6 m13195b(hc6 hc6Var, ReviewType reviewType, boolean z, boolean z2, String str, String str2) {
        CardStatus cardStatus = CardStatus.Known;
        hc6Var.getClass();
        return m13194a(-1, reviewType, z, z2, -1, str, str2, cardStatus, "");
    }
}
