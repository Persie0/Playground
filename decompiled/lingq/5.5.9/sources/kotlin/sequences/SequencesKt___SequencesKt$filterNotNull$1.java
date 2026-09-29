package kotlin.sequences;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m13365d2 = {"<anonymous>", "", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
final class SequencesKt___SequencesKt$filterNotNull$1 extends Lambda implements InterfaceC2052l<Object, Boolean> {

    /* JADX INFO: renamed from: b */
    public static final SequencesKt___SequencesKt$filterNotNull$1 f39964b = new SequencesKt___SequencesKt$filterNotNull$1();

    public SequencesKt___SequencesKt$filterNotNull$1() {
        super(1);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Boolean mo528n(Object obj) {
        return Boolean.valueOf(obj == null);
    }
}
