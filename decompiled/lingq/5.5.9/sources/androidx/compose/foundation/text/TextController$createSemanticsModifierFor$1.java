package androidx.compose.foundation.text;

import androidx.compose.p017ui.semantics.SemanticsProperties;
import androidx.compose.p017ui.text.C0689a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p210k1.C6563a;
import p210k1.C6571i;
import p210k1.C6576n;
import p210k1.InterfaceC6577o;
import p231l1.C7216j;
import p385sf.C9000b;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13365d2 = {"Lk1/o;", "Lsl/e;", "invoke", "(Lk1/o;)V", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class TextController$createSemanticsModifierFor$1 extends Lambda implements InterfaceC2052l<InterfaceC6577o, C9072e> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0689a f2551b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextController f2552c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextController$createSemanticsModifierFor$1(C0689a c0689a, TextController textController) {
        super(1);
        this.f2551b = c0689a;
        this.f2552c = textController;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
        InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
        C5207g.m11111f(interfaceC6577o2, "$this$semantics");
        InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
        C0689a c0689a = this.f2551b;
        C5207g.m11111f(c0689a, "value");
        interfaceC6577o2.mo13162a(SemanticsProperties.f4426s, C9000b.m17251q(c0689a));
        final TextController textController = this.f2552c;
        interfaceC6577o2.mo13162a(C6571i.f37372a, new C6563a(null, new InterfaceC2052l<List<C7216j>, Boolean>() { // from class: androidx.compose.foundation.text.TextController$createSemanticsModifierFor$1.1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(List<C7216j> list) {
                boolean z10;
                List<C7216j> list2 = list;
                C5207g.m11111f(list2, "it");
                C7216j c7216j = textController.f2539a.f2564e;
                if (c7216j != null) {
                    list2.add(c7216j);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }));
        return C9072e.f47360a;
    }
}
