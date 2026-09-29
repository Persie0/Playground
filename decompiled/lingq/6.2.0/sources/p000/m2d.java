package p000;

import android.content.Context;
import com.google.android.gms.internal.mlkit_common.C0967b;
import com.google.android.gms.internal.mlkit_vision_common.C0968a;
import com.google.android.gms.internal.mlkit_vision_document_scanner.C0969a;
import com.google.android.gms.internal.mlkit_vision_text_common.C0984o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m2d extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f50477b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2d(int i) {
        super(4);
        this.f50477b = i;
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: l */
    public final Object mo16603l(Object obj) {
        switch (this.f50477b) {
            case 0:
                g06 g06VarM12269c = g06.m12269c();
                return new C0968a(g06VarM12269c.m12272b(), (e59) g06VarM12269c.m12271a(e59.class), new y0d(g06.m12269c().m12272b(), (c0d) obj));
            case 1:
                g06 g06VarM12269c2 = g06.m12269c();
                Context contextM12272b = g06.m12269c().m12272b();
                ArrayList arrayList = new ArrayList();
                ((bgd) obj).getClass();
                x24 x24Var = new x24();
                al0 al0Var = al0.f793e;
                nba.m17319b(contextM12272b);
                nba.m17318a().m17320c(al0Var);
                al0.f792d.contains(new bs2("json"));
                arrayList.add(x24Var);
                return new C0967b(g06VarM12269c2.m12272b(), (e59) g06VarM12269c2.m12271a(e59.class));
            case 2:
                g06 g06VarM12269c3 = g06.m12269c();
                return new C0969a(g06VarM12269c3.m12272b(), (e59) g06VarM12269c3.m12271a(e59.class), new xjd(g06.m12269c().m12272b(), (qjd) obj));
            default:
                dkd dkdVar = (dkd) obj;
                g06 g06VarM12269c4 = g06.m12269c();
                return new C0984o(g06VarM12269c4.m12272b(), (e59) g06VarM12269c4.m12271a(e59.class), new gkd(g06.m12269c().m12272b(), dkdVar), dkdVar.f35762a);
        }
    }
}
