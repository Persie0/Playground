package androidx.compose.runtime;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p081e0.InterfaceC5321l;
import p105f0.C5455c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13365d2 = {"", "value", "Lsl/e;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class Recomposer$writeObserverOf$1 extends Lambda implements InterfaceC2052l<Object, C9072e> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC5321l f3103b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C5455c<Object> f3104c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$writeObserverOf$1(InterfaceC5321l interfaceC5321l, C5455c<Object> c5455c) {
        super(1);
        this.f3103b = interfaceC5321l;
        this.f3104c = c5455c;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C9072e mo528n(Object obj) {
        C5207g.m11111f(obj, "value");
        this.f3103b.mo1737q(obj);
        C5455c<Object> c5455c = this.f3104c;
        if (c5455c != null) {
            c5455c.add(obj);
        }
        return C9072e.f47360a;
    }
}
