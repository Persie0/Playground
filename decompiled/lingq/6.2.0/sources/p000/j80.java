package p000;

import com.lingq.core.domain.model.offer.BannerType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class j80 {
    public final KSerializer serializer() {
        return (KSerializer) BannerType.$cachedSerializer$delegate.getValue();
    }
}
