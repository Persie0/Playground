package bj;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.playlist.PlaylistAdapter;
import com.lingq.p055ui.token.dictionaries.DictionariesManageAdapter;
import dm.C5207g;
import ki.C6697c;

/* JADX INFO: renamed from: bj.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnTouchListenerC1584g implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9060a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9061b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9062c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ RecyclerView.AbstractC1109b0 f9063d;

    public /* synthetic */ ViewOnTouchListenerC1584g(Object obj, Object obj2, RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        this.f9060a = i10;
        this.f9061b = obj;
        this.f9062c = obj2;
        this.f9063d = abstractC1109b0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f9060a;
        RecyclerView.AbstractC1109b0 abstractC1109b0 = this.f9063d;
        Object obj = this.f9062c;
        Object obj2 = this.f9061b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                PlaylistAdapter.AbstractC3890c.a aVar = (PlaylistAdapter.AbstractC3890c.a) obj2;
                PlaylistAdapter playlistAdapter = (PlaylistAdapter) obj;
                PlaylistAdapter.AbstractC3888a abstractC3888a = (PlaylistAdapter.AbstractC3888a) abstractC1109b0;
                C5207g.m11111f(aVar, "$item");
                C5207g.m11111f(playlistAdapter, "this$0");
                C5207g.m11111f(abstractC3888a, "$holder");
                if (motionEvent.getAction() == 0) {
                    C6697c c6697c = aVar.f25405a;
                    if (c6697c != null) {
                        playlistAdapter.f25400g = c6697c.f37856a;
                    }
                    playlistAdapter.f25398e.mo9874a(abstractC3888a);
                }
                break;
            default:
                DictionariesManageAdapter dictionariesManageAdapter = (DictionariesManageAdapter) obj2;
                DictionariesManageAdapter.AbstractC4874b.a aVar2 = (DictionariesManageAdapter.AbstractC4874b.a) obj;
                DictionariesManageAdapter.AbstractC4873a abstractC4873a = (DictionariesManageAdapter.AbstractC4873a) abstractC1109b0;
                C5207g.m11111f(dictionariesManageAdapter, "this$0");
                C5207g.m11111f(aVar2, "$item");
                C5207g.m11111f(abstractC4873a, "$holder");
                if (motionEvent.getAction() == 0) {
                    dictionariesManageAdapter.f31766g = aVar2.f31770a.f21703a;
                    dictionariesManageAdapter.f31764e.mo9874a(abstractC4873a);
                }
                break;
        }
        return false;
    }
}
