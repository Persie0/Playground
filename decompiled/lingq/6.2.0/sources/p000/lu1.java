package p000;

import com.lingq.core.domain.model.cup.CupPrizeSource;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class lu1 {
    public final KSerializer serializer() {
        return (KSerializer) CupPrizeSource.$cachedSerializer$delegate.getValue();
    }
}
