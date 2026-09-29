package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p001a0.InterfaceC0004c;
import p252m0.InterfaceC7453d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13365d2 = {"Lm0/d;", "", "it", "invoke", "(Lm0/d;J)Ljava/lang/Long;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class BasicTextKt$selectionIdSaver$1 extends Lambda implements InterfaceC2056p<InterfaceC7453d, Long, Long> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0004c f2522b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$selectionIdSaver$1(InterfaceC0004c interfaceC0004c) {
        super(2);
        this.f2522b = interfaceC0004c;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Long mo1337m0(InterfaceC7453d interfaceC7453d, Long l10) {
        long jLongValue = l10.longValue();
        C5207g.m11111f(interfaceC7453d, "$this$Saver");
        if (SelectionRegistrarKt.m1546a(this.f2522b, jLongValue)) {
            return Long.valueOf(jLongValue);
        }
        return null;
    }
}
