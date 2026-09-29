package p000;

import com.lingq.core.domain.model.cup.CupPrizeKind;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ku1 {
    public final KSerializer serializer() {
        return (KSerializer) CupPrizeKind.$cachedSerializer$delegate.getValue();
    }
}
