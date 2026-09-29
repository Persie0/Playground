package com.lingq.shared.domain;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/domain/LingQsOffer;", "", "(Ljava/lang/String;I)V", "amount", "", "LimitOffer", "Day", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public enum LingQsOffer {
    LimitOffer,
    Day;

    /* JADX INFO: renamed from: com.lingq.shared.domain.LingQsOffer$a */
    public /* synthetic */ class C3302a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17771a;

        static {
            int[] iArr = new int[LingQsOffer.values().length];
            try {
                iArr[LingQsOffer.LimitOffer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LingQsOffer.Day.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17771a = iArr;
        }
    }

    public final int amount() {
        int i10 = C3302a.f17771a[ordinal()];
        if (i10 == 1) {
            return 20;
        }
        if (i10 == 2) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }
}
