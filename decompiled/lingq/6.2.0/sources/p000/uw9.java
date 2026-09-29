package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.text.C0180h;
import androidx.window.layout.C0768a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uw9 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64476a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f64477b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f64478c;

    public /* synthetic */ uw9(C0180h c0180h, C3378nn c3378nn, C3042gl c3042gl) {
        this.f64477b = c3378nn;
        this.f64478c = c3042gl;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        ge5 ge5Var;
        int i = this.f64476a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f64478c;
        Object obj2 = this.f64477b;
        switch (i) {
            case 0:
                C3042gl c3042gl = (C3042gl) obj;
                fe5 fe5Var = (fe5) ((C3378nn) obj2).f52979a;
                if (fe5Var instanceof ee5) {
                    ge5 ge5Var2 = ((ee5) fe5Var).f37110c;
                    if (ge5Var2 != null) {
                        ge5Var2.mo11967a(fe5Var);
                    } else {
                        try {
                            String str = ((ee5) fe5Var).f37108a;
                            c3042gl.getClass();
                            try {
                                c3042gl.f40923a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            } catch (ActivityNotFoundException e) {
                                throw new IllegalArgumentException(ux5.m22986i('.', "Can't open ", str), e);
                            }
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((fe5Var instanceof de5) && (ge5Var = ((de5) fe5Var).f35500c) != null) {
                    ge5Var.mo11967a(fe5Var);
                }
                return xfaVar;
            default:
                ((C0768a) obj2).f7137b.mo162a((gd3) obj);
                return xfaVar;
        }
    }

    public /* synthetic */ uw9(C0768a c0768a, gd3 gd3Var) {
        this.f64477b = c0768a;
        this.f64478c = gd3Var;
    }
}
