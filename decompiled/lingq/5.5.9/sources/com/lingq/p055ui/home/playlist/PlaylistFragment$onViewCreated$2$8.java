package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.support.v4.media.C0141b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import bj.ViewOnClickListenerC1581d;
import bj.ViewOnClickListenerC1582e;
import bj.ViewOnClickListenerC1583f;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.PlayerContentController;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ki.C6697c;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$8", m19206f = "PlaylistFragment.kt", m19207l = {455}, m19208m = "invokeSuspend")
public final class PlaylistFragment$onViewCreated$2$8 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25547e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistFragment f25548f;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$8$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$8$1", m19206f = "PlaylistFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39131 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f25549e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistFragment f25550f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39131(PlaylistFragment playlistFragment, InterfaceC9968c<? super C39131> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25550f = playlistFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39131 c39131 = new C39131(this.f25550f, interfaceC9968c);
            c39131.f25549e = ((Number) obj).intValue();
            return c39131;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39131) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f25549e;
            Locale locale = Locale.getDefault();
            final PlaylistFragment playlistFragment = this.f25550f;
            String strM3600t = playlistFragment.m3600t(R.string.playlists_remove_files);
            C5207g.m11110e(strM3600t, "getString(R.string.playlists_remove_files)");
            String strM613i = C0141b.m613i(new Object[]{new Integer(i10)}, 1, locale, strM3600t, "format(locale, format, *args)");
            ImageButton imageButton = playlistFragment.m9981o0().f45451d;
            C5207g.m11110e(imageButton, "binding.btnMenu");
            boolean zBooleanValue = ((Boolean) C7828f.m15572f(EmptyCoroutineContext.f38093a, new PlaylistViewModel$shouldDisableDownloads$1(playlistFragment.m9984r0(), null))).booleanValue();
            InterfaceC2052l<PlaylistActionsPopupMenu$PlaylistActionsMenuItem, C9072e> interfaceC2052l = new InterfaceC2052l<PlaylistActionsPopupMenu$PlaylistActionsMenuItem, C9072e>() { // from class: com.lingq.ui.home.playlist.PlaylistFragment.onViewCreated.2.8.1.1

                /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$8$1$1$a */
                public /* synthetic */ class a {

                    /* JADX INFO: renamed from: a */
                    public static final /* synthetic */ int[] f25552a;

                    static {
                        int[] iArr = new int[PlaylistActionsPopupMenu$PlaylistActionsMenuItem.values().length];
                        try {
                            iArr[PlaylistActionsPopupMenu$PlaylistActionsMenuItem.RemoveFiles.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[PlaylistActionsPopupMenu$PlaylistActionsMenuItem.Downloads.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[PlaylistActionsPopupMenu$PlaylistActionsMenuItem.DownloadAll.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        f25552a = iArr;
                    }
                }

                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(PlaylistActionsPopupMenu$PlaylistActionsMenuItem playlistActionsPopupMenu$PlaylistActionsMenuItem) {
                    PlaylistActionsPopupMenu$PlaylistActionsMenuItem playlistActionsPopupMenu$PlaylistActionsMenuItem2 = playlistActionsPopupMenu$PlaylistActionsMenuItem;
                    C5207g.m11111f(playlistActionsPopupMenu$PlaylistActionsMenuItem2, "menuItem");
                    int i11 = a.f25552a[playlistActionsPopupMenu$PlaylistActionsMenuItem2.ordinal()];
                    PlaylistFragment playlistFragment2 = playlistFragment;
                    if (i11 == 1) {
                        InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                        PlaylistViewModel playlistViewModelM9984r0 = playlistFragment2.m9984r0();
                        ArrayList arrayListM13438f0 = C6752c.m13438f0(C6752c.m13421O((Iterable) playlistViewModelM9984r0.f25604d0.getValue()), C9325m.m17680A(C6752c.m13453u0(playlistViewModelM9984r0.f25600a0.values())));
                        ArrayList arrayList = new ArrayList(C9325m.m17681z(arrayListM13438f0, 10));
                        Iterator it = arrayListM13438f0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C6697c) it.next()).f37856a + ".mp3");
                        }
                        playlistViewModelM9984r0.f25596W.mo14371k(C6752c.m13451s0(arrayList));
                        String strMo498E1 = playlistViewModelM9984r0.mo498E1();
                        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayListM13438f0, 10));
                        Iterator it2 = arrayListM13438f0.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Integer.valueOf(((C6697c) it2.next()).f37856a));
                        }
                        playlistViewModelM9984r0.mo9412i1(arrayList2, strMo498E1);
                        C7828f.m15570d(C8573r0.m16767w0(playlistViewModelM9984r0), null, null, new PlaylistViewModel$clearDownloads$1$2(playlistViewModelM9984r0, null), 3);
                        playlistViewModelM9984r0.f25633y0.setValue(Boolean.FALSE);
                        playlistViewModelM9984r0.f25593T.setValue(EmptyList.f38032a);
                        playlistViewModelM9984r0.f25583J.pause();
                    } else if (i11 == 2) {
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = PlaylistFragment.f25457H0;
                        PlaylistViewModel playlistViewModelM9984r1 = playlistFragment2.m9984r0();
                        StateFlowImpl stateFlowImpl = playlistViewModelM9984r1.f25610g0;
                        boolean zBooleanValue2 = ((Boolean) stateFlowImpl.getValue()).booleanValue();
                        C7135p c7135p = playlistViewModelM9984r1.f25618k0;
                        if (!zBooleanValue2) {
                            String strMo498E2 = playlistViewModelM9984r1.mo498E1();
                            Iterable iterable = (Iterable) c7135p.getValue();
                            ArrayList arrayList3 = new ArrayList(C9325m.m17681z(iterable, 10));
                            Iterator it3 = iterable.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(Integer.valueOf(((PlayerContentController.PlayerContentItem) it3.next()).f17600a));
                            }
                            playlistViewModelM9984r1.mo9412i1(arrayList3, strMo498E2);
                        } else if (!((Collection) c7135p.getValue()).isEmpty()) {
                            playlistViewModelM9984r1.f25633y0.setValue(Boolean.TRUE);
                            C7499b.m14935d0(C8573r0.m16767w0(playlistViewModelM9984r1), playlistViewModelM9984r1.f25617k, "tracksDownload", new PlaylistViewModel$setupAndDownloadTracks$1(playlistViewModelM9984r1, (List) c7135p.getValue(), null));
                        }
                        C7828f.m15570d(C8573r0.m16767w0(playlistViewModelM9984r1), null, null, new PlaylistViewModel$manageDownloads$2(playlistViewModelM9984r1, !((Boolean) stateFlowImpl.getValue()).booleanValue(), null), 3);
                    } else if (i11 == 3) {
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = PlaylistFragment.f25457H0;
                        PlaylistViewModel playlistViewModelM9984r2 = playlistFragment2.m9984r0();
                        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(playlistViewModelM9984r2);
                        UserPlaylist userPlaylist = (UserPlaylist) playlistViewModelM9984r2.f25621m0.getValue();
                        C7499b.m14933c0(interfaceC7882zM16767w0, playlistViewModelM9984r2.f25617k, playlistViewModelM9984r2.f25613i, "downloadAll " + (userPlaylist != null ? Integer.valueOf(userPlaylist.f22080d) : null), new PlaylistViewModel$downloadAll$1(playlistViewModelM9984r2, null));
                    }
                    return C9072e.f47360a;
                }
            };
            Object systemService = imageButton.getContext().getSystemService("layout_inflater");
            C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.menu_playlist_actions, (ViewGroup) null, false);
            int i11 = R.id.llDownloadAll;
            LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewInflate, R.id.llDownloadAll);
            if (linearLayout != null) {
                i11 = R.id.llDownloads;
                LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.llDownloads);
                if (linearLayout2 != null) {
                    i11 = R.id.llRemoveFiles;
                    LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.llRemoveFiles);
                    if (linearLayout3 != null) {
                        i11 = R.id.tvDownloads;
                        TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvDownloads);
                        if (textView != null) {
                            i11 = R.id.tvRemoveFiles;
                            TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvRemoveFiles);
                            if (textView2 != null) {
                                PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
                                textView2.setText(strM613i);
                                linearLayout3.setOnClickListener(new ViewOnClickListenerC1581d(popupWindow, interfaceC2052l, 0));
                                if (zBooleanValue) {
                                    textView.setText(imageButton.getContext().getString(R.string.playlists_enable_downloads));
                                } else {
                                    textView.setText(imageButton.getContext().getString(R.string.playlists_disable_downloads));
                                }
                                linearLayout2.setOnClickListener(new ViewOnClickListenerC1582e(popupWindow, interfaceC2052l, 0));
                                linearLayout.setOnClickListener(new ViewOnClickListenerC1583f(popupWindow, interfaceC2052l, 0));
                                popupWindow.showAsDropDown(imageButton, 0, 0);
                                return C9072e.f47360a;
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistFragment$onViewCreated$2$8(PlaylistFragment playlistFragment, InterfaceC9968c<? super PlaylistFragment$onViewCreated$2$8> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25548f = playlistFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistFragment$onViewCreated$2$8(this.f25548f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistFragment$onViewCreated$2$8) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25547e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
            PlaylistFragment playlistFragment = this.f25548f;
            C7138s c7138s = playlistFragment.m9984r0().f25595V;
            C39131 c39131 = new C39131(playlistFragment, null);
            this.f25547e = 1;
            if (C0062b.m369m0(c7138s, c39131, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
