package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.settings.theme.AbstractC1881a;
import com.lingq.feature.chat.AbstractC2005i;
import com.lingq.feature.widget.layout.collections.layout.AbstractC2868d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f70 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38537a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f38538b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f38539c;

    public /* synthetic */ f70(fa9 fa9Var, boolean z) {
        this.f38537a = 5;
        this.f38539c = fa9Var;
        this.f38538b = z;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f38537a;
        xfa xfaVar = xfa.f68157a;
        boolean z = this.f38538b;
        Object obj3 = this.f38539c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                i4d.m13660b(z, (zi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2005i.m8900a(z, (C0282a) obj3, (ye1) obj, pk9.m19383z(49));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2868d.m9782c((ArrayList) obj3, z, (ye1) obj, pk9.m19383z(49));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                ejd.m11201c(iM19383z, (ye1) obj, (String) obj3, z);
                break;
            case 4:
                ((Integer) obj2).getClass();
                iz5.m14225a((uv3) obj3, z, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                la9 la9Var = la9.f49371a;
                long jM11666b = ((fa9) obj3).m11666b(z, true);
                la9.m16041h(interfaceC0310a, ((gq6) obj2).f41189a, la9.f49372b, jM11666b);
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC1881a.m8670i((TextHighlightStyle) obj3, z, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1881a.m8668g((vs3) obj3, z, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ f70(Object obj, boolean z, int i, int i2) {
        this.f38537a = i2;
        this.f38539c = obj;
        this.f38538b = z;
    }

    public /* synthetic */ f70(boolean z, zi3 zi3Var, int i, int i2) {
        this.f38537a = i2;
        this.f38538b = z;
        this.f38539c = zi3Var;
    }
}
