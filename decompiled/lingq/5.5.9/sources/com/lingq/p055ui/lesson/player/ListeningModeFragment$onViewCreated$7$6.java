package com.lingq.p055ui.lesson.player;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.AbstractC3298c;
import com.lingq.player.AbstractC3299d;
import com.lingq.player.C3296a;
import com.lingq.player.C3300e;
import com.linguist.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import km.InterfaceC6727j;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7133n;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p254m2.C7472a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$6", m19206f = "ListeningModeFragment.kt", m19207l = {377}, m19208m = "invokeSuspend")
public final class ListeningModeFragment$onViewCreated$7$6 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28778e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListeningModeFragment f28779f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$6$a */
    public static final class C4398a implements InterfaceC7117d<C3296a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ListeningModeFragment f28780a;

        public C4398a(ListeningModeFragment listeningModeFragment) {
            this.f28780a = listeningModeFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(C3296a c3296a, InterfaceC9968c interfaceC9968c) {
            C3296a c3296a2 = c3296a;
            boolean zM11106a = C5207g.m11106a(c3296a2.f17739a.f17758b, AbstractC3298c.b.f17753a);
            ListeningModeFragment listeningModeFragment = this.f28780a;
            C3300e c3300e = c3296a2.f17739a;
            if (zM11106a) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                listeningModeFragment.m10210o0().f45227d.setImageResource(R.drawable.ic_playlist_pause);
                listeningModeFragment.m10210o0().f45227d.setBackgroundResource(R.drawable.dr_player_play_rounded_bg);
                listeningModeFragment.m10210o0().f45241r.setValueFrom(0.0f);
                if (C5207g.m11106a(c3300e.f17757a, AbstractC3299d.c.f17756a)) {
                    YouTubePlayerView youTubePlayerView = listeningModeFragment.m10210o0().f45247x;
                    C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
                    if ((youTubePlayerView.getVisibility() == 0) && ((Boolean) listeningModeFragment.m10211p0().f28797M.getValue()).booleanValue()) {
                        listeningModeFragment.m10210o0().f45247x.m10491a(new C4413c(c3296a2));
                    }
                }
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                listeningModeFragment.m10210o0().f45227d.setImageResource(R.drawable.ic_playlist_play);
                listeningModeFragment.m10210o0().f45227d.setBackgroundResource(R.drawable.dr_player_play_rounded_bg);
                if (C5207g.m11106a(c3300e.f17757a, AbstractC3299d.c.f17756a)) {
                    YouTubePlayerView youTubePlayerView2 = listeningModeFragment.m10210o0().f45247x;
                    C5207g.m11110e(youTubePlayerView2, "binding.youtubePlayerView");
                    if ((youTubePlayerView2.getVisibility() == 0) && ((Boolean) listeningModeFragment.m10211p0().f28797M.getValue()).booleanValue()) {
                        listeningModeFragment.m10210o0().f45247x.m10491a(new C4414d(c3296a2));
                    }
                }
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int i10 = c3296a2.f17744f;
            long j10 = i10;
            float seconds = timeUnit.toSeconds(j10);
            int i11 = c3296a2.f17743e;
            float seconds2 = timeUnit.toSeconds(i11);
            if (seconds > seconds2) {
                seconds = seconds2;
            }
            listeningModeFragment.m10210o0().f45241r.setValue(seconds);
            if (seconds2 > 0.0f) {
                listeningModeFragment.m10210o0().f45241r.setValueTo(seconds2);
            }
            TextView textView = listeningModeFragment.m10210o0().f45244u;
            Locale locale = Locale.getDefault();
            long seconds3 = timeUnit.toSeconds(j10);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            String str = String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{new Long(timeUnit.toMinutes(j10)), new Long(seconds3 - timeUnit2.toSeconds(timeUnit.toMinutes(j10)))}, 2));
            C5207g.m11110e(str, "format(locale, format, *args)");
            textView.setText(str);
            int i12 = i11 - i10;
            if (i12 < 0) {
                i12 = 0;
            }
            long j11 = i12;
            C0009a.m32u(new Object[]{new Long(timeUnit.toMinutes(j11)), new Long(timeUnit.toSeconds(j11) - timeUnit2.toSeconds(timeUnit.toMinutes(j11)))}, 2, Locale.getDefault(), "%02d:%02d", "format(locale, format, *args)", listeningModeFragment.m10210o0().f45243t);
            if (c3296a2.f17741c) {
                ImageView imageView = listeningModeFragment.m10210o0().f45236m;
                Context contextM3578a0 = listeningModeFragment.m3578a0();
                Object obj = C7472a.f41322a;
                imageView.setBackground(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_player_play_rounded_bg));
            } else {
                listeningModeFragment.m10210o0().f45236m.setBackground(null);
            }
            if (c3296a2.f17740b) {
                ImageView imageView2 = listeningModeFragment.m10210o0().f45237n;
                Context contextM3578a1 = listeningModeFragment.m3578a0();
                Object obj2 = C7472a.f41322a;
                imageView2.setBackground(C7472a.c.m14849b(contextM3578a1, R.drawable.dr_player_play_rounded_bg));
            } else {
                listeningModeFragment.m10210o0().f45237n.setBackground(null);
            }
            listeningModeFragment.m10210o0().f45233j.setText(c3296a2.f17742d.f47231b);
            listeningModeFragment.m10211p0().f28804T.setValue(Long.valueOf(j10));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListeningModeFragment$onViewCreated$7$6(ListeningModeFragment listeningModeFragment, InterfaceC9968c<? super ListeningModeFragment$onViewCreated$7$6> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28779f = listeningModeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ListeningModeFragment$onViewCreated$7$6(this.f28779f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ListeningModeFragment$onViewCreated$7$6) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28778e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
            ListeningModeFragment listeningModeFragment = this.f28779f;
            InterfaceC7133n<C3296a> interfaceC7133nMo9399J0 = listeningModeFragment.m10211p0().mo9399J0();
            C4398a c4398a = new C4398a(listeningModeFragment);
            this.f28778e = 1;
            if (interfaceC7133nMo9399J0.mo9539a(c4398a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        throw new KotlinNothingValueException();
    }
}
