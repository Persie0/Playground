package dk;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v4.media.C0141b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import mo.C7661i;
import p003a2.C0009a;
import p225kk.C6716m;
import p278nh.InterfaceC7774a;
import p312p2.C8169a;
import p487xi.C10201i;
import ph.C8260b4;
import si.ViewOnClickListenerC9029m;
import sl.C9072e;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: renamed from: dk.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5199d extends AbstractC1170u<ChallengeDetail, a> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<Pair<ChallengeDetail, Boolean>> f33248e;

    /* JADX INFO: renamed from: dk.d$a */
    public static final class a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8260b4 f33249u;

        public a(C8260b4 c8260b4) {
            super(c8260b4.f44620a);
            this.f33249u = c8260b4;
        }
    }

    /* JADX INFO: renamed from: dk.d$b */
    public static final class b extends C1162m.e<ChallengeDetail> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(ChallengeDetail challengeDetail, ChallengeDetail challengeDetail2) {
            return C5207g.m11106a(challengeDetail, challengeDetail2);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(ChallengeDetail challengeDetail, ChallengeDetail challengeDetail2) {
            return C5207g.m11106a(challengeDetail.f21634b, challengeDetail2.f21634b);
        }
    }

    public C5199d(C10201i.a.b.C10686a c10686a) {
        super(new b());
        this.f33248e = c10686a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        a aVar = (a) abstractC1109b0;
        ChallengeDetail challengeDetailM4528p = m4528p(i10);
        C5207g.m11110e(challengeDetailM4528p, "item");
        C8260b4 c8260b4 = aVar.f33249u;
        ImageView imageView = c8260b4.f44622c;
        C5207g.m11110e(imageView, "ivChallenge");
        C4924a.m10438Q(imageView, challengeDetailM4528p.f21642j, 0.0f, 0, 0, 14);
        c8260b4.f44625f.setText(challengeDetailM4528p.f21635c);
        String str = challengeDetailM4528p.f21637e;
        if (str != null && (C7661i.m15250P2(str) ^ true)) {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[2];
            String strM10472m = null;
            objArr[0] = str != null ? C4924a.m10472m(3, str, null) : null;
            String str2 = challengeDetailM4528p.f21638f;
            if (str2 != null) {
                strM10472m = C4924a.m10472m(3, str2, null);
            }
            objArr[1] = strM10472m;
            c8260b4.f44623d.setText(C0141b.m613i(objArr, 2, locale, "%s - %s", "format(locale, format, *args)"));
        }
        List<Integer> list = C6716m.f37937a;
        Context context = aVar.f7054a.getContext();
        C5207g.m11110e(context, "itemView.context");
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(C8169a.m16216h(C6716m.m13333r(R.attr.blueTint, context), 25));
        MaterialTextView materialTextView = c8260b4.f44621b;
        materialTextView.setBackgroundTintList(colorStateListValueOf);
        boolean z10 = challengeDetailM4528p.f21643k;
        RelativeLayout relativeLayout = c8260b4.f44628i;
        if (z10) {
            C5207g.m11110e(relativeLayout, "viewRanking");
            C4924a.m10457e0(relativeLayout);
            C4924a.m10442U(materialTextView);
            int i11 = challengeDetailM4528p.f21644l;
            TextView textView = c8260b4.f44626g;
            CircularProgressIndicator circularProgressIndicator = c8260b4.f44627h;
            TextView textView2 = c8260b4.f44624e;
            if (i11 > 0) {
                C5207g.m11110e(circularProgressIndicator, "viewProgress");
                C4924a.m10442U(circularProgressIndicator);
                C5207g.m11110e(textView, "tvRank");
                C4924a.m10457e0(textView);
                C5207g.m11110e(textView2, "tvChallengeRank");
                C4924a.m10457e0(textView2);
                int i12 = challengeDetailM4528p.f21640h;
                if (i11 > i12) {
                    i11 = i12;
                }
                C0009a.m32u(new Object[]{Integer.valueOf(i11)}, 1, Locale.getDefault(), "%d", "format(locale, format, *args)", textView2);
                C9072e c9072e = C9072e.f47360a;
            } else {
                circularProgressIndicator.m4935d();
                C5207g.m11110e(textView, "tvRank");
                C4924a.m10422A(textView);
                C5207g.m11110e(textView2, "tvChallengeRank");
                C4924a.m10422A(textView2);
            }
        } else {
            C4924a.m10457e0(materialTextView);
            C5207g.m11110e(relativeLayout, "viewRanking");
            C4924a.m10442U(relativeLayout);
        }
        c8260b4.f44620a.setOnClickListener(new ViewOnClickListenerC9029m(this, 19, aVar));
        materialTextView.setOnClickListener(new ViewOnClickListenerC9734i(this, 17, aVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_stats_challenge, recyclerView, false);
        int i11 = R.id.btnJoin;
        MaterialTextView materialTextView = (MaterialTextView) C0062b.m298P0(viewM849h, R.id.btnJoin);
        if (materialTextView != null) {
            i11 = R.id.ivChallenge;
            ImageView imageView = (ImageView) C0062b.m298P0(viewM849h, R.id.ivChallenge);
            if (imageView != null) {
                i11 = R.id.tvChallengeDuration;
                TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvChallengeDuration);
                if (textView != null) {
                    i11 = R.id.tvChallengeRank;
                    TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.tvChallengeRank);
                    if (textView2 != null) {
                        i11 = R.id.tvChallengeTitle;
                        TextView textView3 = (TextView) C0062b.m298P0(viewM849h, R.id.tvChallengeTitle);
                        if (textView3 != null) {
                            i11 = R.id.tvRank;
                            TextView textView4 = (TextView) C0062b.m298P0(viewM849h, R.id.tvRank);
                            if (textView4 != null) {
                                i11 = R.id.viewCenter;
                                if (C0062b.m298P0(viewM849h, R.id.viewCenter) != null) {
                                    i11 = R.id.viewProgress;
                                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(viewM849h, R.id.viewProgress);
                                    if (circularProgressIndicator != null) {
                                        i11 = R.id.viewRank;
                                        if (((FrameLayout) C0062b.m298P0(viewM849h, R.id.viewRank)) != null) {
                                            i11 = R.id.viewRanking;
                                            RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(viewM849h, R.id.viewRanking);
                                            if (relativeLayout != null) {
                                                return new a(new C8260b4((ConstraintLayout) viewM849h, materialTextView, imageView, textView, textView2, textView3, textView4, circularProgressIndicator, relativeLayout));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
    }
}
