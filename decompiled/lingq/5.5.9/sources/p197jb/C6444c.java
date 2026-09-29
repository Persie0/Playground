package p197jb;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC2543b;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.internal.TelemetryData;
import p041c5.C1702c;
import p136gc.C5752h;
import p136gc.C5761q;
import p152hb.AbstractC5989m;
import p152hb.C5961d;
import p152hb.C5963d1;
import p152hb.C5976h1;
import p152hb.C5991m1;
import p176ib.C6276k;
import p412ub.C9515d;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: jb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6444c extends AbstractC2543b<C6276k> {

    /* JADX INFO: renamed from: k */
    public static final C2542a<C6276k> f36992k = new C2542a<>("ClientTelemetry.API", new C6443b(), new C2542a.f());

    public C6444c(Context context) {
        super(context, f36992k, C6276k.f36471b, AbstractC2543b.a.f13897c);
    }

    /* JADX INFO: renamed from: b */
    public final C5761q m13068b(TelemetryData telemetryData) {
        AbstractC5989m.a aVar = new AbstractC5989m.a();
        Feature[] featureArr = {C9515d.f49019a};
        aVar.f35529a = new C1702c(telemetryData);
        C5976h1 c5976h1 = new C5976h1(aVar, featureArr, false);
        C5752h c5752h = new C5752h();
        C5961d c5961d = this.f13896j;
        c5961d.getClass();
        HandlerC9517f handlerC9517f = c5961d.f35440I;
        handlerC9517f.sendMessage(handlerC9517f.obtainMessage(4, new C5963d1(new C5991m1(c5976h1, c5752h, this.f13895i), c5961d.f35450i.get(), this)));
        return c5752h.f34812a;
    }
}
