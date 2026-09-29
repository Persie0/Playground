package androidx.compose.p017ui.text.font;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p328q1.C8476m;
import p328q1.C8486w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13365d2 = {"Lq1/w;", "it", "", "invoke", "(Lq1/w;)Ljava/lang/Object;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class FontFamilyResolverImpl$createDefaultTypeface$1 extends Lambda implements InterfaceC2052l<C8486w, Object> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0697c f4614b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$createDefaultTypeface$1(C0697c c0697c) {
        super(1);
        this.f4614b = c0697c;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(C8486w c8486w) {
        C8486w c8486w2 = c8486w;
        C5207g.m11111f(c8486w2, "it");
        int i10 = c8486w2.f45668c;
        int i11 = c8486w2.f45669d;
        Object obj = c8486w2.f45670e;
        C8476m c8476m = c8486w2.f45667b;
        C5207g.m11111f(c8476m, "fontWeight");
        return this.f4614b.m2596b(new C8486w(null, c8476m, i10, i11, obj)).getValue();
    }
}
