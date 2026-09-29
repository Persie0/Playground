package androidx.compose.runtime;

import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p081e0.InterfaceC5321l;
import p105f0.C5455c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m13365d2 = {"Lsl/e;", "invoke", "()V", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class Recomposer$performRecompose$1$1 extends Lambda implements InterfaceC2041a<C9072e> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5455c<Object> f3075b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC5321l f3076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$performRecompose$1$1(InterfaceC5321l interfaceC5321l, C5455c c5455c) {
        super(0);
        this.f3075b = c5455c;
        this.f3076c = interfaceC5321l;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final C9072e mo807E() {
        C5455c<Object> c5455c = this.f3075b;
        int i10 = c5455c.f34008a;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f3076c.mo1737q(c5455c.get(i11));
        }
        return C9072e.f47360a;
    }
}
