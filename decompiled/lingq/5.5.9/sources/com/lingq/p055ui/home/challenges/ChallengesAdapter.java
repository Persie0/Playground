package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import fi.C5537a;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import mo.C7661i;
import ni.C7793a;
import p003a2.C0009a;
import p225kk.C6716m;
import p278nh.InterfaceC7774a;
import p312p2.C8169a;
import ph.C8277e3;
import ph.C8392z2;
import si.ViewOnClickListenerC9028l;
import si.ViewOnClickListenerC9029m;

/* JADX INFO: loaded from: classes2.dex */
public final class ChallengesAdapter extends AbstractC1170u<AbstractC3515b, AbstractC3514a> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<Pair<C5537a, Boolean>> f23043e;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/home/challenges/ChallengesAdapter$ChallengeAdapterItemType;", "", "(Ljava/lang/String;I)V", "Title", "Challenge", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum ChallengeAdapterItemType {
        Title,
        Challenge
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesAdapter$a */
    public static abstract class AbstractC3514a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesAdapter$a$a */
        public static final class a extends AbstractC3514a {

            /* JADX INFO: renamed from: u */
            public final C8277e3 f23044u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8277e3 c8277e3, InterfaceC7774a<Pair<C5537a, Boolean>> interfaceC7774a) {
                C5207g.m11111f(interfaceC7774a, "clickListener");
                ConstraintLayout constraintLayout = c8277e3.f44723a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f23044u = c8277e3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesAdapter$a$b */
        public static final class b extends AbstractC3514a {

            /* JADX INFO: renamed from: u */
            public final C8392z2 f23045u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8392z2 c8392z2) {
                TextView textView = c8392z2.f45505a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f23045u = c8392z2;
            }
        }

        public AbstractC3514a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesAdapter$b */
    public static abstract class AbstractC3515b {

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesAdapter$b$a */
        public static final class a extends AbstractC3515b {

            /* JADX INFO: renamed from: a */
            public final C5537a f23046a;

            public a(C5537a c5537a) {
                C5207g.m11111f(c5537a, "challengeInfo");
                this.f23046a = c5537a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && C5207g.m11106a(this.f23046a, ((a) obj).f23046a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f23046a.hashCode();
            }

            public final String toString() {
                return "Challenge(challengeInfo=" + this.f23046a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesAdapter$b$b */
        public static final class b extends AbstractC3515b {

            /* JADX INFO: renamed from: a */
            public final int f23047a;

            public b(int i10) {
                this.f23047a = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f23047a == ((b) obj).f23047a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f23047a);
            }

            public final String toString() {
                return C0166e.m768o(new StringBuilder("Title(title="), this.f23047a, ")");
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesAdapter$c */
    public static final class C3516c extends C1162m.e<AbstractC3515b> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC3515b abstractC3515b, AbstractC3515b abstractC3515b2) {
            AbstractC3515b abstractC3515b3 = abstractC3515b;
            AbstractC3515b abstractC3515b4 = abstractC3515b2;
            if ((abstractC3515b3 instanceof AbstractC3515b.b) && (abstractC3515b4 instanceof AbstractC3515b.b)) {
                return C5207g.m11106a(abstractC3515b3, abstractC3515b4);
            }
            if ((abstractC3515b3 instanceof AbstractC3515b.a) && (abstractC3515b4 instanceof AbstractC3515b.a)) {
                return C5207g.m11106a(abstractC3515b3, abstractC3515b4);
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (((com.lingq.p055ui.home.challenges.ChallengesAdapter.AbstractC3515b.a) r6).f23046a.f34235a == ((com.lingq.p055ui.home.challenges.ChallengesAdapter.AbstractC3515b.a) r7).f23046a.f34235a) goto L15;
         */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo481b(AbstractC3515b abstractC3515b, AbstractC3515b abstractC3515b2) {
            AbstractC3515b abstractC3515b3 = abstractC3515b;
            AbstractC3515b abstractC3515b4 = abstractC3515b2;
            if ((abstractC3515b3 instanceof AbstractC3515b.b) && (abstractC3515b4 instanceof AbstractC3515b.b)) {
                if (((AbstractC3515b.b) abstractC3515b3).f23047a == ((AbstractC3515b.b) abstractC3515b4).f23047a) {
                    return true;
                }
                return false;
            }
            if (abstractC3515b3 instanceof AbstractC3515b.a) {
                if (abstractC3515b4 instanceof AbstractC3515b.a) {
                }
            }
            return false;
        }
    }

    public ChallengesAdapter(InterfaceC7774a<Pair<C5537a, Boolean>> interfaceC7774a) {
        super(new C3516c());
        this.f23043e = interfaceC7774a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC3515b abstractC3515bM4528p = m4528p(i10);
        if (abstractC3515bM4528p instanceof AbstractC3515b.b) {
            return ChallengeAdapterItemType.Title.ordinal();
        }
        if (abstractC3515bM4528p instanceof AbstractC3515b.a) {
            return ChallengeAdapterItemType.Challenge.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        AbstractC3514a abstractC3514a = (AbstractC3514a) abstractC1109b0;
        if (abstractC3514a instanceof AbstractC3514a.b) {
            AbstractC3515b abstractC3515bM4528p = m4528p(i10);
            C5207g.m11109d(abstractC3515bM4528p, "null cannot be cast to non-null type com.lingq.ui.home.challenges.ChallengesAdapter.ChallengeAdapterItem.Title");
            AbstractC3514a.b bVar = (AbstractC3514a.b) abstractC3514a;
            bVar.f23045u.f45506b.setText(bVar.f7054a.getContext().getString(((AbstractC3515b.b) abstractC3515bM4528p).f23047a));
        } else if (abstractC3514a instanceof AbstractC3514a.a) {
            AbstractC3515b abstractC3515bM4528p2 = m4528p(i10);
            C5207g.m11109d(abstractC3515bM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.challenges.ChallengesAdapter.ChallengeAdapterItem.Challenge");
            AbstractC3515b.a aVar = (AbstractC3515b.a) abstractC3515bM4528p2;
            AbstractC3514a.a aVar2 = (AbstractC3514a.a) abstractC3514a;
            C5537a c5537a = aVar.f23046a;
            C5207g.m11111f(c5537a, "challengeInfo");
            C8277e3 c8277e3 = aVar2.f23044u;
            ImageView imageView = c8277e3.f44725c;
            C5207g.m11110e(imageView, "ivChallenge");
            C4924a.m10438Q(imageView, c5537a.f34240f, 0.0f, 0, 0, 14);
            c8277e3.f44730h.setText(c5537a.f34237c);
            View view = aVar2.f7054a;
            Resources resources = view.getContext().getResources();
            int i11 = c5537a.f34238d;
            c8277e3.f44728f.setText(resources.getQuantityString(R.plurals.challenges_participants, i11, Integer.valueOf(i11)));
            MaterialTextView materialTextView = c8277e3.f44724b;
            boolean z10 = c5537a.f34242h;
            FrameLayout frameLayout = c8277e3.f44734l;
            boolean z11 = c5537a.f34241g;
            ImageView imageView2 = c8277e3.f44726d;
            TextView textView = c8277e3.f44731i;
            if (z10) {
                C5207g.m11110e(frameLayout, "binding.viewRank");
                C4924a.m10442U(frameLayout);
                if (c5537a.f34246l) {
                    C5207g.m11110e(textView, "tvJoinedOrCompleted");
                    C4924a.m10457e0(textView);
                    C5207g.m11110e(imageView2, "ivJoinedOrCompleted");
                    C4924a.m10457e0(imageView2);
                    textView.setText(view.getContext().getString(R.string.search_completed));
                    List<Integer> list = C6716m.f37937a;
                    Context context = view.getContext();
                    C5207g.m11110e(context, "itemView.context");
                    textView.setTextColor(C6716m.m13333r(R.attr.greenTint, context));
                    Context context2 = view.getContext();
                    C5207g.m11110e(context2, "itemView.context");
                    imageView2.setColorFilter(C6716m.m13333r(R.attr.greenTint, context2));
                } else if (z11) {
                    C5207g.m11110e(textView, "tvJoinedOrCompleted");
                    C4924a.m10457e0(textView);
                    C5207g.m11110e(imageView2, "ivJoinedOrCompleted");
                    C4924a.m10457e0(imageView2);
                    textView.setText(view.getContext().getString(R.string.challenges_joined));
                    List<Integer> list2 = C6716m.f37937a;
                    Context context3 = view.getContext();
                    C5207g.m11110e(context3, "itemView.context");
                    textView.setTextColor(C6716m.m13333r(R.attr.blueStrongColor, context3));
                    Context context4 = view.getContext();
                    C5207g.m11110e(context4, "itemView.context");
                    imageView2.setColorFilter(C6716m.m13333r(R.attr.blueStrongColor, context4));
                } else {
                    C5207g.m11110e(textView, "tvJoinedOrCompleted");
                    C4924a.m10442U(textView);
                    C5207g.m11110e(imageView2, "ivJoinedOrCompleted");
                    C4924a.m10442U(imageView2);
                }
            } else {
                List<Integer> list3 = C6716m.f37937a;
                Context context5 = view.getContext();
                C5207g.m11110e(context5, "itemView.context");
                materialTextView.setBackgroundTintList(ColorStateList.valueOf(C8169a.m16216h(C6716m.m13333r(R.attr.blueTint, context5), 25)));
                C5207g.m11110e(frameLayout, "viewRank");
                C4924a.m10457e0(frameLayout);
                C5207g.m11110e(textView, "tvJoinedOrCompleted");
                C4924a.m10442U(textView);
                C5207g.m11110e(imageView2, "ivJoinedOrCompleted");
                C4924a.m10442U(imageView2);
                RelativeLayout relativeLayout = c8277e3.f44735m;
                if (z11) {
                    C4924a.m10442U(materialTextView);
                    C5207g.m11110e(relativeLayout, "viewRanking");
                    C4924a.m10457e0(relativeLayout);
                    int i12 = c5537a.f34239e;
                    TextView textView2 = c8277e3.f44732j;
                    CircularProgressIndicator circularProgressIndicator = c8277e3.f44733k;
                    TextView textView3 = c8277e3.f44729g;
                    if (i12 > 0) {
                        C5207g.m11110e(textView2, "tvRank");
                        C4924a.m10457e0(textView2);
                        C5207g.m11110e(textView3, "tvChallengeRank");
                        C4924a.m10457e0(textView3);
                        C5207g.m11110e(circularProgressIndicator, "viewProgress");
                        C4924a.m10442U(circularProgressIndicator);
                        if (i12 <= i11) {
                            i11 = i12;
                        }
                        C0009a.m32u(new Object[]{Integer.valueOf(i11)}, 1, Locale.getDefault(), "%d", "format(locale, format, *args)", textView3);
                    } else {
                        circularProgressIndicator.m4935d();
                        C5207g.m11110e(textView2, "tvRank");
                        C4924a.m10422A(textView2);
                        C5207g.m11110e(textView3, "tvChallengeRank");
                        C4924a.m10422A(textView3);
                    }
                } else {
                    C4924a.m10457e0(materialTextView);
                    C5207g.m11110e(relativeLayout, "viewRanking");
                    C4924a.m10442U(relativeLayout);
                }
            }
            String str = c5537a.f34243i;
            if (str != null && (C7661i.m15250P2(str) ^ true)) {
                Locale locale = Locale.getDefault();
                Object[] objArr = new Object[2];
                objArr[0] = str != null ? C4924a.m10472m(3, str, null) : null;
                String str2 = c5537a.f34244j;
                objArr[1] = str2 != null ? C4924a.m10472m(3, str2, null) : null;
                c8277e3.f44727e.setText(C0141b.m613i(objArr, 2, locale, "%s - %s", "format(locale, format, *args)"));
            }
            c8277e3.f44723a.setOnClickListener(new ViewOnClickListenerC9028l(abstractC3514a, this, aVar, 0));
            materialTextView.setOnClickListener(new ViewOnClickListenerC9029m(this, 0, aVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == ChallengeAdapterItemType.Title.ordinal()) {
            return new AbstractC3514a.b(C8392z2.m16420a(C7793a.m15500d(recyclerView), recyclerView));
        }
        if (i10 != ChallengeAdapterItemType.Challenge.ordinal()) {
            throw new IllegalStateException();
        }
        View viewInflate = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_challenge, (ViewGroup) recyclerView, false);
        int i11 = R.id.btnJoin;
        MaterialTextView materialTextView = (MaterialTextView) C0062b.m298P0(viewInflate, R.id.btnJoin);
        if (materialTextView != null) {
            i11 = R.id.ivChallenge;
            ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.ivChallenge);
            if (imageView != null) {
                i11 = R.id.ivJoinedOrCompleted;
                ImageView imageView2 = (ImageView) C0062b.m298P0(viewInflate, R.id.ivJoinedOrCompleted);
                if (imageView2 != null) {
                    i11 = R.id.tvChallengeDuration;
                    TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvChallengeDuration);
                    if (textView != null) {
                        i11 = R.id.tvChallengeParticipants;
                        TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvChallengeParticipants);
                        if (textView2 != null) {
                            i11 = R.id.tvChallengeRank;
                            TextView textView3 = (TextView) C0062b.m298P0(viewInflate, R.id.tvChallengeRank);
                            if (textView3 != null) {
                                i11 = R.id.tvChallengeTitle;
                                TextView textView4 = (TextView) C0062b.m298P0(viewInflate, R.id.tvChallengeTitle);
                                if (textView4 != null) {
                                    i11 = R.id.tvJoinedOrCompleted;
                                    TextView textView5 = (TextView) C0062b.m298P0(viewInflate, R.id.tvJoinedOrCompleted);
                                    if (textView5 != null) {
                                        i11 = R.id.tvRank;
                                        TextView textView6 = (TextView) C0062b.m298P0(viewInflate, R.id.tvRank);
                                        if (textView6 != null) {
                                            i11 = R.id.viewCenter;
                                            if (C0062b.m298P0(viewInflate, R.id.viewCenter) != null) {
                                                i11 = R.id.viewProgress;
                                                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(viewInflate, R.id.viewProgress);
                                                if (circularProgressIndicator != null) {
                                                    i11 = R.id.viewRank;
                                                    FrameLayout frameLayout = (FrameLayout) C0062b.m298P0(viewInflate, R.id.viewRank);
                                                    if (frameLayout != null) {
                                                        i11 = R.id.viewRanking;
                                                        RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(viewInflate, R.id.viewRanking);
                                                        if (relativeLayout != null) {
                                                            return new AbstractC3514a.a(new C8277e3((ConstraintLayout) viewInflate, materialTextView, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, circularProgressIndicator, frameLayout, relativeLayout), this.f23043e);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
