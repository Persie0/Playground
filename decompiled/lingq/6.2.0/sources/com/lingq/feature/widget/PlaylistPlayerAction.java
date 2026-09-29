package com.lingq.feature.widget;

import android.content.Context;
import android.content.Intent;
import com.lingq.core.player.service.PlayerService;
import kotlin.coroutines.Continuation;
import p000.AbstractC3027g6;
import p000.InterfaceC3448p5;
import p000.ln3;
import p000.o56;
import p000.pwc;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistPlayerAction implements InterfaceC3448p5 {
    public static final int $stable = 0;

    @Override // p000.InterfaceC3448p5
    public Object onAction(Context context, ln3 ln3Var, AbstractC3027g6 abstractC3027g6, Continuation<? super xfa> continuation) {
        Integer num = (Integer) ((o56) abstractC3027g6).f53865a.get(pwc.f56933a);
        xfa xfaVar = xfa.f68157a;
        if (num != null) {
            int iIntValue = num.intValue();
            Intent intent = new Intent(context, (Class<?>) PlayerService.class);
            intent.setAction("com.lingq.action.PLAY_FROM_WIDGET");
            intent.putExtra("com.lingq.extra.LESSON_ID", iIntValue);
            context.startForegroundService(intent);
        }
        return xfaVar;
    }
}
