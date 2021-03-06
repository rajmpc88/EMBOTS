package de.dfki.embots.bml.lex;

import de.dfki.embots.embrscript.EMBRPose;

/**
 * Stores pose information: corresponding EMBR pose, whether hold is
 * included and absolute sequence time (in sec).
 */
public class PoseSemantics
{

    public EMBRPose pose;
    public boolean includeHold = false;
    public double sequenceTime = 0d;
    public boolean _emitFeedback;
    public String _feedBackId;

    PoseSemantics(EMBRPose p)
    {
        pose = p;
    }

    PoseSemantics(EMBRPose p, double time, boolean hold)
    {
        pose = p;
        sequenceTime = time;
        includeHold = hold;
    }

    PoseSemantics(EMBRPose p, double time, boolean hold, boolean emitFeedback, String feedbackId)
    {
        pose = p;
        sequenceTime = time;
        includeHold = hold;
        _emitFeedback = emitFeedback;
        _feedBackId = feedbackId;

    }


}
