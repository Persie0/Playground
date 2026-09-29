package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.challenge.ChallengeUserProfile;
import com.lingq.shared.uimodel.challenge.ChallengeUserRanking;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mo.C7661i;
import ni.C7793a;
import p003a2.C0009a;
import p254m2.C7472a;
import p274n8.ViewOnClickListenerC7718c;
import ph.C8283f3;
import ph.C8289g3;
import ph.C8352r2;
import ph.C8357s2;
import ph.C8362t2;
import ph.C8372v2;
import ph.C8392z2;
import si.C9023g;
import si.C9035s;
import si.ViewTreeObserverOnGlobalLayoutListenerC9017a;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class ChallengeDetailAdapter extends AbstractC1170u<AbstractC3482b, AbstractC3481a> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC3483c f22835e;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m13365d2 = {"Lcom/lingq/ui/home/challenges/ChallengeDetailAdapter$ChallengeDetailItemType;", "", "(Ljava/lang/String;I)V", "Title", "ChallengeDetail", "Metrics", "Progress", "LeaderBoardTitle", "LeaderBoardLoading", "LeaderBoard", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum ChallengeDetailItemType {
        Title,
        ChallengeDetail,
        Metrics,
        Progress,
        LeaderBoardTitle,
        LeaderBoardLoading,
        LeaderBoard
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$a */
    public static abstract class AbstractC3481a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$a$a */
        public static final class a extends AbstractC3481a {

            /* JADX INFO: renamed from: u */
            public final C8352r2 f22836u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8352r2 c8352r2) {
                LinearLayout linearLayout = c8352r2.f45192a;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f22836u = c8352r2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$a$b */
        public static final class b extends AbstractC3481a {
            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8283f3 c8283f3) {
                LinearLayout linearLayout = c8283f3.f44765a;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$a$c */
        public static final class c extends AbstractC3481a {

            /* JADX INFO: renamed from: u */
            public final C8362t2 f22837u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8362t2 c8362t2) {
                ConstraintLayout constraintLayoutM16414c = c8362t2.m16414c();
                C5207g.m11110e(constraintLayoutM16414c, "binding.root");
                super(constraintLayoutM16414c);
                this.f22837u = c8362t2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$a$d */
        public static final class d extends AbstractC3481a {

            /* JADX INFO: renamed from: u */
            public final C8357s2 f22838u;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(C8357s2 c8357s2) {
                ConstraintLayout constraintLayout = c8357s2.f45251a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f22838u = c8357s2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$a$e */
        public static final class e extends AbstractC3481a {

            /* JADX INFO: renamed from: u */
            public final C8372v2 f22839u;

            /* JADX WARN: Illegal instructions before constructor call */
            public e(C8372v2 c8372v2) {
                RelativeLayout relativeLayoutM16417a = c8372v2.m16417a();
                C5207g.m11110e(relativeLayoutM16417a, "binding.root");
                super(relativeLayoutM16417a);
                this.f22839u = c8372v2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$a$f */
        public static final class f extends AbstractC3481a {

            /* JADX INFO: renamed from: u */
            public final C8289g3 f22840u;

            /* JADX INFO: renamed from: v */
            public final C9035s f22841v;

            /* JADX INFO: renamed from: w */
            public final LinearLayoutManager f22842w;

            /* JADX WARN: Illegal instructions before constructor call */
            public f(C8289g3 c8289g3) {
                MaterialCardView materialCardView = c8289g3.f44817a;
                C5207g.m11110e(materialCardView, "binding.root");
                super(materialCardView);
                this.f22840u = c8289g3;
                this.f22841v = new C9035s();
                materialCardView.getContext();
                this.f22842w = new LinearLayoutManager(1);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$a$g */
        public static final class g extends AbstractC3481a {

            /* JADX INFO: renamed from: u */
            public final C8392z2 f22843u;

            /* JADX WARN: Illegal instructions before constructor call */
            public g(C8392z2 c8392z2) {
                TextView textView = c8392z2.f45505a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f22843u = c8392z2;
            }
        }

        public AbstractC3481a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$b */
    public static abstract class AbstractC3482b {

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$b$a */
        public static final class a extends AbstractC3482b {

            /* JADX INFO: renamed from: a */
            public final ChallengeDetail f22844a;

            /* JADX INFO: renamed from: b */
            public final int f22845b;

            /* JADX INFO: renamed from: c */
            public final int f22846c;

            /* JADX INFO: renamed from: d */
            public final boolean f22847d;

            public a(ChallengeDetail challengeDetail, int i10, int i11, boolean z10) {
                this.f22844a = challengeDetail;
                this.f22845b = i10;
                this.f22846c = i11;
                this.f22847d = z10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (C5207g.m11106a(this.f22844a, aVar.f22844a) && this.f22845b == aVar.f22845b && this.f22846c == aVar.f22846c && this.f22847d == aVar.f22847d) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [int] */
            /* JADX WARN: Type inference failed for: r1v3, types: [int] */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r1v5 */
            public final int hashCode() {
                int iM16d = C0009a.m16d(this.f22846c, C0009a.m16d(this.f22845b, this.f22844a.hashCode() * 31, 31), 31);
                boolean z10 = this.f22847d;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return iM16d + r10;
            }

            public final String toString() {
                return "Challenge(challenge=" + this.f22844a + ", knownWords=" + this.f22845b + ", lingqs=" + this.f22846c + ", isLoading=" + this.f22847d + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$b$b */
        public static final class b extends AbstractC3482b {

            /* JADX INFO: renamed from: a */
            public static final b f22848a = new b();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$b$c */
        public static final class c extends AbstractC3482b {

            /* JADX INFO: renamed from: a */
            public final int f22849a;

            public c(int i10) {
                this.f22849a = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f22849a == ((c) obj).f22849a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f22849a);
            }

            public final String toString() {
                return C0166e.m768o(new StringBuilder("LeaderBoardTitle(metricTitle="), this.f22849a, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$b$d */
        public static final class d extends AbstractC3482b {

            /* JADX INFO: renamed from: a */
            public final int f22850a = R.string.challenges_leaderboard;

            /* JADX INFO: renamed from: b */
            public final ChallengeType f22851b;

            public d(ChallengeType challengeType) {
                this.f22851b = challengeType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                if (this.f22850a == dVar.f22850a && this.f22851b == dVar.f22851b) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f22851b.hashCode() + (Integer.hashCode(this.f22850a) * 31);
            }

            public final String toString() {
                return "Metrics(title=" + this.f22850a + ", challengeType=" + this.f22851b + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$b$e */
        public static final class e extends AbstractC3482b {

            /* JADX INFO: renamed from: a */
            public final List<C9023g> f22852a;

            /* JADX INFO: renamed from: b */
            public final int f22853b;

            /* JADX INFO: renamed from: c */
            public final boolean f22854c;

            public e(int i10, List list, boolean z10) {
                C5207g.m11111f(list, "challengeGoals");
                this.f22852a = list;
                this.f22853b = i10;
                this.f22854c = z10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return C5207g.m11106a(this.f22852a, eVar.f22852a) && this.f22853b == eVar.f22853b && this.f22854c == eVar.f22854c;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [int] */
            /* JADX WARN: Type inference failed for: r1v2, types: [int] */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4 */
            public final int hashCode() {
                int iM16d = C0009a.m16d(this.f22853b, this.f22852a.hashCode() * 31, 31);
                boolean z10 = this.f22854c;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return iM16d + r10;
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Progress(challengeGoals=");
                sb2.append(this.f22852a);
                sb2.append(", activityScore=");
                sb2.append(this.f22853b);
                sb2.append(", isLoading=");
                return C0166e.m769p(sb2, this.f22854c, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$b$f */
        public static final class f extends AbstractC3482b {

            /* JADX INFO: renamed from: a */
            public final ChallengeUserRanking f22855a;

            public f(ChallengeUserRanking challengeUserRanking) {
                C5207g.m11111f(challengeUserRanking, "rankingChallenge");
                this.f22855a = challengeUserRanking;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && C5207g.m11106a(this.f22855a, ((f) obj).f22855a);
            }

            public final int hashCode() {
                return this.f22855a.hashCode();
            }

            public final String toString() {
                return "Ranking(rankingChallenge=" + this.f22855a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$b$g */
        public static final class g extends AbstractC3482b {

            /* JADX INFO: renamed from: a */
            public final int f22856a = R.string.challenges_my_progress;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f22856a == ((g) obj).f22856a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f22856a);
            }

            public final String toString() {
                return C0166e.m768o(new StringBuilder("Title(title="), this.f22856a, ")");
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$c */
    public interface InterfaceC3483c {
        /* JADX INFO: renamed from: a */
        void mo9781a(LeaderboardMetric leaderboardMetric);
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeDetailAdapter$d */
    public static final class C3484d extends C1162m.e<AbstractC3482b> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC3482b abstractC3482b, AbstractC3482b abstractC3482b2) {
            AbstractC3482b abstractC3482b3 = abstractC3482b;
            AbstractC3482b abstractC3482b4 = abstractC3482b2;
            if ((abstractC3482b3 instanceof AbstractC3482b.g) && (abstractC3482b4 instanceof AbstractC3482b.g)) {
                return C5207g.m11106a(abstractC3482b3, abstractC3482b4);
            }
            if ((abstractC3482b3 instanceof AbstractC3482b.a) && (abstractC3482b4 instanceof AbstractC3482b.a)) {
                return C5207g.m11106a(abstractC3482b3, abstractC3482b4);
            }
            if ((abstractC3482b3 instanceof AbstractC3482b.d) && (abstractC3482b4 instanceof AbstractC3482b.d)) {
                return C5207g.m11106a(abstractC3482b3, abstractC3482b4);
            }
            if ((abstractC3482b3 instanceof AbstractC3482b.e) && (abstractC3482b4 instanceof AbstractC3482b.e)) {
                return C5207g.m11106a(abstractC3482b3, abstractC3482b4);
            }
            if ((abstractC3482b3 instanceof AbstractC3482b.f) && (abstractC3482b4 instanceof AbstractC3482b.f)) {
                return C5207g.m11106a(abstractC3482b3, abstractC3482b4);
            }
            if ((abstractC3482b3 instanceof AbstractC3482b.c) && (abstractC3482b4 instanceof AbstractC3482b.c)) {
                return C5207g.m11106a(abstractC3482b3, abstractC3482b4);
            }
            if ((abstractC3482b3 instanceof AbstractC3482b.b) && (abstractC3482b4 instanceof AbstractC3482b.b)) {
                return C5207g.m11106a(abstractC3482b3, abstractC3482b4);
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (((com.lingq.p055ui.home.challenges.ChallengeDetailAdapter.AbstractC3482b.a) r6).f22844a.f21633a == ((com.lingq.p055ui.home.challenges.ChallengeDetailAdapter.AbstractC3482b.a) r7).f22844a.f21633a) goto L51;
         */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo481b(AbstractC3482b abstractC3482b, AbstractC3482b abstractC3482b2) {
            AbstractC3482b abstractC3482b3 = abstractC3482b;
            AbstractC3482b abstractC3482b4 = abstractC3482b2;
            if ((abstractC3482b3 instanceof AbstractC3482b.g) && (abstractC3482b4 instanceof AbstractC3482b.g)) {
                if (((AbstractC3482b.g) abstractC3482b3).f22856a == ((AbstractC3482b.g) abstractC3482b4).f22856a) {
                    return true;
                }
                return false;
            }
            if (!(abstractC3482b3 instanceof AbstractC3482b.a) || !(abstractC3482b4 instanceof AbstractC3482b.a)) {
                if ((abstractC3482b3 instanceof AbstractC3482b.d) && (abstractC3482b4 instanceof AbstractC3482b.d)) {
                    if (((AbstractC3482b.d) abstractC3482b3).f22850a == ((AbstractC3482b.d) abstractC3482b4).f22850a) {
                        return true;
                    }
                    return false;
                }
                if (!(abstractC3482b3 instanceof AbstractC3482b.e) || !(abstractC3482b4 instanceof AbstractC3482b.e)) {
                    if (!(abstractC3482b3 instanceof AbstractC3482b.f) || !(abstractC3482b4 instanceof AbstractC3482b.f)) {
                        if (abstractC3482b3 instanceof AbstractC3482b.c) {
                        }
                        return false;
                    }
                    ChallengeUserProfile challengeUserProfile = ((AbstractC3482b.f) abstractC3482b3).f22855a.f21676d;
                    Integer numValueOf = challengeUserProfile != null ? Integer.valueOf(challengeUserProfile.f21664a) : null;
                    ChallengeUserProfile challengeUserProfile2 = ((AbstractC3482b.f) abstractC3482b4).f22855a.f21676d;
                    return C5207g.m11106a(numValueOf, challengeUserProfile2 != null ? Integer.valueOf(challengeUserProfile2.f21664a) : null);
                }
                return true;
            }
        }
    }

    public ChallengeDetailAdapter(ChallengeDetailsFragment.C3485a c3485a) {
        super(new C3484d());
        this.f22835e = c3485a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC3482b abstractC3482bM4528p = m4528p(i10);
        if (abstractC3482bM4528p instanceof AbstractC3482b.g) {
            return ChallengeDetailItemType.Title.ordinal();
        }
        if (abstractC3482bM4528p instanceof AbstractC3482b.a) {
            return ChallengeDetailItemType.ChallengeDetail.ordinal();
        }
        if (abstractC3482bM4528p instanceof AbstractC3482b.d) {
            return ChallengeDetailItemType.Metrics.ordinal();
        }
        if (abstractC3482bM4528p instanceof AbstractC3482b.f) {
            return ChallengeDetailItemType.LeaderBoard.ordinal();
        }
        if (abstractC3482bM4528p instanceof AbstractC3482b.c) {
            return ChallengeDetailItemType.LeaderBoardTitle.ordinal();
        }
        if (abstractC3482bM4528p instanceof AbstractC3482b.e) {
            return ChallengeDetailItemType.Progress.ordinal();
        }
        if (abstractC3482bM4528p instanceof AbstractC3482b.b) {
            return ChallengeDetailItemType.LeaderBoardLoading.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        C8352r2 c8352r2;
        AbstractC3481a abstractC3481a = (AbstractC3481a) abstractC1109b0;
        if (abstractC3481a instanceof AbstractC3481a.g) {
            AbstractC3482b abstractC3482bM4528p = m4528p(i10);
            C5207g.m11109d(abstractC3482bM4528p, "null cannot be cast to non-null type com.lingq.ui.home.challenges.ChallengeDetailAdapter.ChallengeDetailAdapterItem.Title");
            AbstractC3481a.g gVar = (AbstractC3481a.g) abstractC3481a;
            C8392z2 c8392z2 = gVar.f22843u;
            c8392z2.f45506b.setText(gVar.f7054a.getContext().getString(((AbstractC3482b.g) abstractC3482bM4528p).f22856a));
            c8392z2.f45506b.setTextAppearance(R.style.TextAppearance);
            return;
        }
        Drawable drawableM14849b = null;
        drawableM14849b = null;
        drawableM14849b = null;
        drawableM14849b = null;
        drawableM14849b = null;
        if (abstractC3481a instanceof AbstractC3481a.a) {
            AbstractC3482b abstractC3482bM4528p2 = m4528p(i10);
            C5207g.m11109d(abstractC3482bM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.challenges.ChallengeDetailAdapter.ChallengeDetailAdapterItem.Challenge");
            AbstractC3482b.a aVar = (AbstractC3482b.a) abstractC3482bM4528p2;
            AbstractC3481a.a aVar2 = (AbstractC3481a.a) abstractC3481a;
            ChallengeDetail challengeDetail = aVar.f22844a;
            C5207g.m11111f(challengeDetail, "detail");
            C8352r2 c8352r3 = aVar2.f22836u;
            if (aVar.f22847d) {
                ShimmerFrameLayout shimmerFrameLayout = c8352r3.f45196e;
                C5207g.m11110e(shimmerFrameLayout, "shimmerLayout");
                C4924a.m10457e0(shimmerFrameLayout);
                RelativeLayout relativeLayout = c8352r3.f45194c;
                C5207g.m11110e(relativeLayout, "contentLayout");
                C4924a.m10442U(relativeLayout);
                c8352r2 = c8352r3;
            } else {
                RelativeLayout relativeLayout2 = c8352r3.f45194c;
                C5207g.m11110e(relativeLayout2, "contentLayout");
                C4924a.m10457e0(relativeLayout2);
                ShimmerFrameLayout shimmerFrameLayout2 = c8352r3.f45196e;
                C5207g.m11110e(shimmerFrameLayout2, "shimmerLayout");
                C4924a.m10442U(shimmerFrameLayout2);
                String str = challengeDetail.f21636d;
                TextView textView = c8352r3.f45197f;
                textView.setText(str);
                textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC9017a(textView, c8352r3));
                c8352r3.f45203l.setText(challengeDetail.f21635c);
                ImageView imageView = c8352r3.f45195d;
                C5207g.m11110e(imageView, "ivChallenge");
                C4924a.m10438Q(imageView, challengeDetail.f21642j, 0.0f, 0, 0, 14);
                Locale locale = Locale.US;
                int i11 = challengeDetail.f21640h;
                c8352r3.f45204m.setText(C0141b.m613i(new Object[]{Integer.valueOf(i11)}, 1, locale, "%,d", "format(locale, format, *args)"));
                c8352r3.f45205n.setText(aVar2.f7054a.getContext().getResources().getQuantityString(R.plurals.challenges_details_participants, i11));
                String str2 = challengeDetail.f21637e;
                if ((str2 != null && (C7661i.m15250P2(str2) ^ true)) != false) {
                    Object[] objArr = new Object[2];
                    objArr[0] = str2 != null ? C4924a.m10472m(3, str2, null) : null;
                    String str3 = challengeDetail.f21638f;
                    objArr[1] = str3 != null ? C4924a.m10472m(3, str3, null) : null;
                    c8352r3.f45198g.setText(C0141b.m613i(objArr, 2, locale, "%s - %s", "format(locale, format, *args)"));
                }
                String value = ChallengeType.StreakDays.getValue();
                String str4 = challengeDetail.f21639g;
                boolean zM11106a = C5207g.m11106a(str4, value);
                TextView textView2 = c8352r3.f45202k;
                TextView textView3 = c8352r3.f45200i;
                TextView textView4 = c8352r3.f45201j;
                TextView textView5 = c8352r3.f45199h;
                if (zM11106a || C5207g.m11106a(str4, ChallengeType.ThousandWords.getValue())) {
                    c8352r2 = c8352r3;
                    C5207g.m11110e(textView5, "tvKnownWords");
                    C4924a.m10422A(textView5);
                    C5207g.m11110e(textView4, "tvLingQs");
                    C4924a.m10422A(textView4);
                    C5207g.m11110e(textView3, "tvKnownWordsTitle");
                    C4924a.m10422A(textView3);
                    C5207g.m11110e(textView2, "tvLingqsTitle");
                    C4924a.m10422A(textView2);
                } else {
                    C5207g.m11110e(textView5, "tvKnownWords");
                    C4924a.m10457e0(textView5);
                    C5207g.m11110e(textView4, "tvLingQs");
                    C4924a.m10457e0(textView4);
                    C5207g.m11110e(textView3, "tvKnownWordsTitle");
                    C4924a.m10457e0(textView3);
                    C5207g.m11110e(textView2, "tvLingqsTitle");
                    C4924a.m10457e0(textView2);
                    C0009a.m32u(new Object[]{Integer.valueOf(aVar.f22845b)}, 1, locale, "%,d", "format(locale, format, *args)", textView5);
                    C0009a.m32u(new Object[]{Integer.valueOf(aVar.f22846c)}, 1, locale, "%,d", "format(locale, format, *args)", textView4);
                    C9072e c9072e = C9072e.f47360a;
                    c8352r2 = c8352r3;
                }
            }
            c8352r2.f45193b.setOnClickListener(new ViewOnClickListenerC7718c(6, abstractC3481a));
            return;
        }
        if (!(abstractC3481a instanceof AbstractC3481a.e)) {
            if (abstractC3481a instanceof AbstractC3481a.d) {
                AbstractC3482b abstractC3482bM4528p3 = m4528p(i10);
                C5207g.m11109d(abstractC3482bM4528p3, "null cannot be cast to non-null type com.lingq.ui.home.challenges.ChallengeDetailAdapter.ChallengeDetailAdapterItem.Ranking");
                AbstractC3481a.d dVar = (AbstractC3481a.d) abstractC3481a;
                ChallengeUserRanking challengeUserRanking = ((AbstractC3482b.f) abstractC3482bM4528p3).f22855a;
                C5207g.m11111f(challengeUserRanking, "rankingChallenge");
                C8357s2 c8357s2 = dVar.f22838u;
                ImageView imageView2 = (ImageView) c8357s2.f45255e;
                C5207g.m11110e(imageView2, "ivUser");
                ChallengeUserProfile challengeUserProfile = challengeUserRanking.f21676d;
                String str5 = challengeUserProfile != null ? challengeUserProfile.f21666c : null;
                View view = dVar.f7054a;
                Context context = view.getContext();
                Object obj = C7472a.f41322a;
                C4924a.m10436O(imageView2, str5, 0.0f, C7472a.c.m14849b(context, R.drawable.ic_profile_avatar_s), 6);
                c8357s2.f45252b.setText(C0141b.m613i(new Object[]{Integer.valueOf(challengeUserRanking.f21674b)}, 1, Locale.US, "%,d", "format(locale, format, *args)"));
                ((TextView) c8357s2.f45256f).setText(String.valueOf(challengeUserRanking.f21673a));
                c8357s2.f45253c.setText(challengeUserProfile != null ? challengeUserProfile.f21665b : null);
                String str6 = challengeUserProfile != null ? challengeUserProfile.f21667d : null;
                ImageView imageView3 = c8357s2.f45254d;
                if (str6 == null) {
                    imageView3.setImageDrawable(null);
                    return;
                }
                String str7 = challengeUserProfile != null ? challengeUserProfile.f21667d : null;
                if (str7 != null) {
                    int iHashCode = str7.hashCode();
                    if (iHashCode != -1307827859) {
                        if (iHashCode != 94630981) {
                            if (iHashCode == 812757528 && str7.equals("librarian")) {
                                drawableM14849b = C7472a.c.m14849b(view.getContext(), R.drawable.ic_profile_librarian);
                            }
                        } else if (str7.equals("chief")) {
                            drawableM14849b = C7472a.c.m14849b(view.getContext(), R.drawable.ic_profile_chief_librarian);
                        }
                    } else if (str7.equals("editor")) {
                        drawableM14849b = C7472a.c.m14849b(view.getContext(), R.drawable.ic_profile_editor);
                    }
                }
                imageView3.setImageDrawable(drawableM14849b);
                return;
            }
            if (!(abstractC3481a instanceof AbstractC3481a.f)) {
                if (!(abstractC3481a instanceof AbstractC3481a.c)) {
                    boolean z10 = abstractC3481a instanceof AbstractC3481a.b;
                    return;
                }
                AbstractC3482b abstractC3482bM4528p4 = m4528p(i10);
                C5207g.m11109d(abstractC3482bM4528p4, "null cannot be cast to non-null type com.lingq.ui.home.challenges.ChallengeDetailAdapter.ChallengeDetailAdapterItem.LeaderBoardTitle");
                AbstractC3481a.c cVar = (AbstractC3481a.c) abstractC3481a;
                ((TextView) cVar.f22837u.f45286c).setText(cVar.f7054a.getContext().getString(((AbstractC3482b.c) abstractC3482bM4528p4).f22849a));
                return;
            }
            AbstractC3482b abstractC3482bM4528p5 = m4528p(i10);
            C5207g.m11109d(abstractC3482bM4528p5, "null cannot be cast to non-null type com.lingq.ui.home.challenges.ChallengeDetailAdapter.ChallengeDetailAdapterItem.Progress");
            AbstractC3482b.e eVar = (AbstractC3482b.e) abstractC3482bM4528p5;
            AbstractC3481a.f fVar = (AbstractC3481a.f) abstractC3481a;
            C8289g3 c8289g3 = fVar.f22840u;
            int i12 = eVar.f22853b;
            if (i12 != 0) {
                TextView textView6 = c8289g3.f44820d;
                C5207g.m11110e(textView6, "tvActivityScore");
                C4924a.m10457e0(textView6);
                TextView textView7 = c8289g3.f44821e;
                C5207g.m11110e(textView7, "tvActivityScoreTitle");
                C4924a.m10457e0(textView7);
                Locale locale2 = Locale.US;
                C0009a.m32u(new Object[]{fVar.f7054a.getContext().getString(R.string.challenges_rank)}, 1, locale2, "%s: ", "format(locale, format, *args)", textView7);
                c8289g3.f44820d.setText(C0141b.m613i(new Object[]{Integer.valueOf(i12)}, 1, locale2, "%,d", "format(locale, format, *args)"));
            } else {
                TextView textView8 = c8289g3.f44820d;
                C5207g.m11110e(textView8, "tvActivityScore");
                C4924a.m10442U(textView8);
                TextView textView9 = c8289g3.f44821e;
                C5207g.m11110e(textView9, "tvActivityScoreTitle");
                C4924a.m10442U(textView9);
            }
            if (eVar.f22854c) {
                ShimmerFrameLayout shimmerFrameLayout3 = c8289g3.f44819c;
                C5207g.m11110e(shimmerFrameLayout3, "shimmerLayout");
                C4924a.m10457e0(shimmerFrameLayout3);
                c8289g3.f44819c.m6747b();
                RecyclerView recyclerView = c8289g3.f44818b;
                C5207g.m11110e(recyclerView, "rvGoals");
                C4924a.m10422A(recyclerView);
                return;
            }
            c8289g3.f44819c.m6748c();
            ShimmerFrameLayout shimmerFrameLayout4 = c8289g3.f44819c;
            C5207g.m11110e(shimmerFrameLayout4, "shimmerLayout");
            C4924a.m10442U(shimmerFrameLayout4);
            RecyclerView recyclerView2 = c8289g3.f44818b;
            C5207g.m11110e(recyclerView2, "onBindViewHolder$lambda$3$lambda$2");
            C4924a.m10457e0(recyclerView2);
            recyclerView2.setLayoutManager(fVar.f22842w);
            C9035s c9035s = fVar.f22841v;
            recyclerView2.setAdapter(c9035s);
            c9035s.m4529q(eVar.f22852a);
            return;
        }
        AbstractC3482b abstractC3482bM4528p6 = m4528p(i10);
        C5207g.m11109d(abstractC3482bM4528p6, "null cannot be cast to non-null type com.lingq.ui.home.challenges.ChallengeDetailAdapter.ChallengeDetailAdapterItem.Metrics");
        AbstractC3482b.d dVar2 = (AbstractC3482b.d) abstractC3482bM4528p6;
        AbstractC3481a.e eVar2 = (AbstractC3481a.e) abstractC3481a;
        C8372v2 c8372v2 = eVar2.f22839u;
        c8372v2.f45407c.setText(eVar2.f7054a.getContext().getString(dVar2.f22850a));
        ChallengeType challengeType = dVar2.f22851b;
        List<LeaderboardMetric> sorts = challengeType.getSorts();
        ArrayList arrayList = new ArrayList(C9325m.m17681z(sorts, 10));
        Iterator<T> it = sorts.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            View view2 = abstractC3481a.f7054a;
            if (!zHasNext) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(view2.getContext(), R.layout.view_spinner_text, arrayList);
                arrayAdapter.setDropDownViewResource(R.layout.view_spinner_dropdown_text);
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) c8372v2.f45408d;
                appCompatSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
                C5207g.m11110e(appCompatSpinner, "holder.binding.spinnerContent");
                C4924a.m10449a0(appCompatSpinner, challengeType.getDefaultFilter().name());
                appCompatSpinner.setOnItemSelectedListener(new C3535a(abstractC3481a, dVar2, arrayList, this));
                return;
            }
            arrayList.add(view2.getContext().getString(((LeaderboardMetric) it.next()).getValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0101 A[PHI: r2
      0x0101: PHI (r2v41 int) = 
      (r2v40 int)
      (r2v42 int)
      (r2v43 int)
      (r2v44 int)
      (r2v45 int)
      (r2v47 int)
      (r2v48 int)
      (r2v49 int)
      (r2v50 int)
      (r2v51 int)
      (r2v52 int)
     binds: [B:8:0x0049, B:10:0x0055, B:12:0x0061, B:14:0x006c, B:16:0x0077, B:20:0x008c, B:22:0x0098, B:24:0x00a4, B:26:0x00b1, B:28:0x00be, B:30:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b9 A[PHI: r2
      0x01b9: PHI (r2v29 int) = (r2v28 int), (r2v30 int), (r2v31 int) binds: [B:55:0x017d, B:57:0x0189, B:59:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == ChallengeDetailItemType.Title.ordinal()) {
            return new AbstractC3481a.g(C8392z2.m16420a(C7793a.m15500d(recyclerView), recyclerView));
        }
        int iOrdinal = ChallengeDetailItemType.ChallengeDetail.ordinal();
        int i11 = R.id.tvName;
        int i12 = R.id.shimmerLayout;
        if (i10 == iOrdinal) {
            View viewInflate = C7793a.m15500d(recyclerView).inflate(R.layout.list_challenge_details, (ViewGroup) recyclerView, false);
            int i13 = R.id.btnShowAll;
            MaterialButton materialButton = (MaterialButton) C0062b.m298P0(viewInflate, R.id.btnShowAll);
            if (materialButton != null) {
                i13 = R.id.contentLayout;
                RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(viewInflate, R.id.contentLayout);
                if (relativeLayout != null) {
                    i13 = R.id.ivChallenge;
                    ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.ivChallenge);
                    if (imageView != null) {
                        i13 = R.id.llStats;
                        if (((LinearLayout) C0062b.m298P0(viewInflate, R.id.llStats)) != null) {
                            i13 = R.id.llStatsTitles;
                            if (((LinearLayout) C0062b.m298P0(viewInflate, R.id.llStatsTitles)) == null) {
                                i11 = i13;
                            } else {
                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C0062b.m298P0(viewInflate, R.id.shimmerLayout);
                                if (shimmerFrameLayout != null) {
                                    i13 = R.id.tvDescription;
                                    TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvDescription);
                                    if (textView != null) {
                                        i13 = R.id.tvDuration;
                                        TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvDuration);
                                        if (textView2 != null) {
                                            i13 = R.id.tvKnownWords;
                                            TextView textView3 = (TextView) C0062b.m298P0(viewInflate, R.id.tvKnownWords);
                                            if (textView3 != null) {
                                                i13 = R.id.tvKnownWordsTitle;
                                                TextView textView4 = (TextView) C0062b.m298P0(viewInflate, R.id.tvKnownWordsTitle);
                                                if (textView4 != null) {
                                                    i13 = R.id.tvLingQs;
                                                    TextView textView5 = (TextView) C0062b.m298P0(viewInflate, R.id.tvLingQs);
                                                    if (textView5 != null) {
                                                        i13 = R.id.tvLingqsTitle;
                                                        TextView textView6 = (TextView) C0062b.m298P0(viewInflate, R.id.tvLingqsTitle);
                                                        if (textView6 != null) {
                                                            TextView textView7 = (TextView) C0062b.m298P0(viewInflate, R.id.tvName);
                                                            if (textView7 != null) {
                                                                i11 = R.id.tvParticipants;
                                                                TextView textView8 = (TextView) C0062b.m298P0(viewInflate, R.id.tvParticipants);
                                                                if (textView8 != null) {
                                                                    i11 = R.id.tvParticipantsTitle;
                                                                    TextView textView9 = (TextView) C0062b.m298P0(viewInflate, R.id.tvParticipantsTitle);
                                                                    if (textView9 != null) {
                                                                        return new AbstractC3481a.a(new C8352r2((LinearLayout) viewInflate, materialButton, relativeLayout, imageView, shimmerFrameLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9));
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            i11 = i13;
                                                        }
                                                    } else {
                                                        i11 = i13;
                                                    }
                                                } else {
                                                    i11 = i13;
                                                }
                                            } else {
                                                i11 = i13;
                                            }
                                        } else {
                                            i11 = i13;
                                        }
                                    } else {
                                        i11 = i13;
                                    }
                                } else {
                                    i11 = R.id.shimmerLayout;
                                }
                            }
                        } else {
                            i11 = i13;
                        }
                    } else {
                        i11 = i13;
                    }
                } else {
                    i11 = i13;
                }
            } else {
                i11 = i13;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        }
        int iOrdinal2 = ChallengeDetailItemType.Metrics.ordinal();
        int i14 = R.id.tvRank;
        if (i10 == iOrdinal2) {
            View viewInflate2 = C7793a.m15500d(recyclerView).inflate(R.layout.list_header_challenge_leaderboard_filter, (ViewGroup) recyclerView, false);
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) C0062b.m298P0(viewInflate2, R.id.spinnerContent);
            if (appCompatSpinner != null) {
                TextView textView10 = (TextView) C0062b.m298P0(viewInflate2, R.id.tvRank);
                if (textView10 != null) {
                    return new AbstractC3481a.e(new C8372v2((RelativeLayout) viewInflate2, appCompatSpinner, textView10, 0));
                }
            } else {
                i14 = R.id.spinnerContent;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i14)));
        }
        if (i10 == ChallengeDetailItemType.LeaderBoard.ordinal()) {
            View viewInflate3 = C7793a.m15500d(recyclerView).inflate(R.layout.list_challenge_leaderboard, (ViewGroup) recyclerView, false);
            int i15 = R.id.ivRole;
            ImageView imageView2 = (ImageView) C0062b.m298P0(viewInflate3, R.id.ivRole);
            if (imageView2 != null) {
                i15 = R.id.ivUser;
                ImageView imageView3 = (ImageView) C0062b.m298P0(viewInflate3, R.id.ivUser);
                if (imageView3 != null) {
                    i15 = R.id.tvAmount;
                    TextView textView11 = (TextView) C0062b.m298P0(viewInflate3, R.id.tvAmount);
                    if (textView11 != null) {
                        TextView textView12 = (TextView) C0062b.m298P0(viewInflate3, R.id.tvName);
                        if (textView12 != null) {
                            TextView textView13 = (TextView) C0062b.m298P0(viewInflate3, R.id.tvRank);
                            if (textView13 != null) {
                                return new AbstractC3481a.d(new C8357s2((ConstraintLayout) viewInflate3, imageView2, imageView3, textView11, textView12, textView13));
                            }
                            i11 = R.id.tvRank;
                        }
                    } else {
                        i11 = i15;
                    }
                } else {
                    i11 = i15;
                }
            } else {
                i11 = i15;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i11)));
        }
        if (i10 == ChallengeDetailItemType.LeaderBoardTitle.ordinal()) {
            View viewInflate4 = C7793a.m15500d(recyclerView).inflate(R.layout.list_header_challenge_leaderboard_title, (ViewGroup) recyclerView, false);
            TextView textView14 = (TextView) C0062b.m298P0(viewInflate4, R.id.tvMetric);
            if (textView14 != null) {
                TextView textView15 = (TextView) C0062b.m298P0(viewInflate4, R.id.tvRank);
                if (textView15 != null) {
                    return new AbstractC3481a.c(new C8362t2((ConstraintLayout) viewInflate4, textView14, textView15, 1));
                }
            } else {
                i14 = R.id.tvMetric;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i14)));
        }
        if (i10 != ChallengeDetailItemType.Progress.ordinal()) {
            if (i10 != ChallengeDetailItemType.LeaderBoardLoading.ordinal()) {
                throw new IllegalStateException();
            }
            View viewInflate5 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_challenge_leaderboard_loading, (ViewGroup) recyclerView, false);
            if (viewInflate5 != null) {
                return new AbstractC3481a.b(new C8283f3((LinearLayout) viewInflate5));
            }
            throw new NullPointerException("rootView");
        }
        View viewInflate6 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_challenge_progress, (ViewGroup) recyclerView, false);
        RecyclerView recyclerView2 = (RecyclerView) C0062b.m298P0(viewInflate6, R.id.rvGoals);
        if (recyclerView2 != null) {
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C0062b.m298P0(viewInflate6, R.id.shimmerLayout);
            if (shimmerFrameLayout2 != null) {
                i12 = R.id.tvActivityScore;
                TextView textView16 = (TextView) C0062b.m298P0(viewInflate6, R.id.tvActivityScore);
                if (textView16 != null) {
                    i12 = R.id.tvActivityScoreTitle;
                    TextView textView17 = (TextView) C0062b.m298P0(viewInflate6, R.id.tvActivityScoreTitle);
                    if (textView17 != null) {
                        return new AbstractC3481a.f(new C8289g3((MaterialCardView) viewInflate6, recyclerView2, shimmerFrameLayout2, textView16, textView17, 0));
                    }
                }
            }
        } else {
            i12 = R.id.rvGoals;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate6.getResources().getResourceName(i12)));
    }
}
